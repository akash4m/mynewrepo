package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class MyClass {

	
	private List<Integer> job = new ArrayList<Integer>();
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      final MyClass m = new MyClass();
       
        
       Thread t1 = new Thread(new Runnable(){
    	  public void run(){
    		  try {
				m.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
       });
       
       Thread t2 = new Thread(new Runnable(){
     	  public void run(){
     		  try {
				m.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     	  }
        });
       
       t1.start();
       t2.start();
       t1.join();
	}
	
	public void produce() throws InterruptedException{
		int i =0;
		while(true){
			//size cannot greater than 2
		synchronized (this) {
			
			if(job.size() == 2){
				System.out.println("producing the job size full releasing lock going for wait");
				wait();
			}
			System.out.println("producing the job added th job");
			job.add(i++);
			System.out.println("producing the job notifying other thread");
			notify();
			System.out.println("producing the job going for sleep");
			Thread.sleep(1000);
			
		}
		}
	}
	
	public void consume() throws InterruptedException{
		while(true){
			synchronized (this) {
				// size cannot be less than 0
				if(job.size() == 0){
					System.out.println("consuming the job size empty releasing lock going for wait");
					wait();
				}
				System.out.println("consuming the job remving job");
				job.remove(0);
				System.out.println("consuming the job notifying other thread");
				notify();
				System.out.println("consuming the job goint for sleep");
				Thread.sleep(1000);
			}
		}
	}
	
}
