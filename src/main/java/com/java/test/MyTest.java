package com.java.test;

public class MyTest {
    
	private String name;
	private String age;
	private String company;
	
	public MyTest(String name,String age,String company){
		this.name  = name;
		this.age = age;
		this.company = company;
	}
	
	public MyTest(){
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        final MyTest m = new MyTest("akash","24","justdial");
        
        Thread t1 = new Thread( new Runnable(){
        	public void run(){
        		m.change();
        	}
        });
        
          
        //t2.start();
        t1.start();
        t1.join();
        System.out.println("fuck you");
	}
	
	public  synchronized void change() {
		try {
			System.out.println("***");
			wait();
			//Thread.sleep(5000);
			System.out.println("***");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
