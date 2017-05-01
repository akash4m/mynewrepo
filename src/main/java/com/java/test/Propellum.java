package com.java.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Propellum {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
   
		ExecutorService es = Executors.newFixedThreadPool(3);
		List<Callable<Integer>> callList = new ArrayList<Callable<Integer>>();
		callList.add(new calling());
		callList.add(new calling());
		callList.add(new calling());
		
		List<Future<Integer>> result= es.invokeAll(callList);
		
		for(Future<Integer> f : result){
			System.out.println("future result "+f.get());
		}
		
	}

}

class calling implements Callable<Integer>{
	
	final int MAX_NUMBER = 20;
	static Integer i = 0;

	public  Integer call() throws Exception {
		while(i<MAX_NUMBER){
		synchronized (i) {
			i++;	
			System.out.println(" print number "+ i);	
		}
		
		}
		return i;
	}
	
}