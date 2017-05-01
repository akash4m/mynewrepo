package com.java.test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Stats {


	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}
	
	public static class StatisticsAggregatorImpl implements StatisticsAggregator {
        
	 private  static ConcurrentHashMap<String,String> map = new ConcurrentHashMap<String,String>();
		
		
		public void putNewPrice(String symbol, double price) {
		// YOUR CODE HERE
			
			if(map.containsKey(symbol)){
				 String value = map.get(symbol);
				 double avgprice = (price+Double.parseDouble(value.split("#")[0]))/2;
				 int counter = Integer.parseInt(value.split("#")[1]) + 1;
				 map.put(symbol, avgprice+"#"+counter);
			}else{
				map.put(symbol, price+"#1");
			}
		}

		
		public double getAveragePrice(String symbol) {
			String value = map.get(symbol);
			 double avgprice = Double.parseDouble(value.split("#")[0]);
			 return avgprice;
		}

		
		public int getTickCount(String symbol) {
		// YOUR CODE HERE
			String value = map.get(symbol);
			int counter = Integer.parseInt(value.split("#")[1]);
			return counter;
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<String>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(String.format("%s %.4f %d", symbol,
						stats.getAveragePrice(symbol),
						stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
	
	
}
/*
 * ample Input
1,IBM 22.22,AAPL 33.33,IBM 44.44,AAPL 55.55
Sample Output
AAPL 44.4400 2
IBM 33.3300 2
 * 
 * 
 * 
 * */
