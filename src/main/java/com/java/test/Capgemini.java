package com.java.test;

public class Capgemini implements Cloneable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Fuck f = new Fuck();
         //  f.
	}
	
	
	

}

class Fuck implements Cloneable {
	
	public Object doclone(){
		Object obj = null;
		try {
			obj = clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
}
