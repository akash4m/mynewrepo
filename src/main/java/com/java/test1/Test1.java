package com.java.test1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    
	private int x;
	private int y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.out.println(fuckyou());
       Parent p = new Child();
       System.out.println(p.x);
       List<Parent> l = new ArrayList<Parent>();
	}
	
	public static int fuckyou(){
		try{
			return 1;
		}catch(Exception ex){
			return 2;
		}finally{
			return 3;
		}
	}

}

 class Parent{
	 int x = 10;
}
 
 class Child extends Parent{
	 int x = 20;
 }