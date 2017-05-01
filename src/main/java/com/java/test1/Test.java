package com.java.test1;

import java.util.Scanner;

import com.java.test.MyStack;

public class Test {

	private int previous;
	private int current;
	private int max;
	
	
	public Test(int m){
		this.previous = 0;
		this.current = 1;
		this.max = m;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PLEASE ENTER TILL WHAT NUMBER YOU WANT PRINT");
		Scanner sc = new Scanner(System.in);
       Test t = new Test(sc.nextInt());
		t.fibonacci();
          
	}
	
	private void fibonacci(){
		int temp = 0;
		if(this.current > this.max){
			return;
		}
		
		if(this.previous == 0 && this.current == 1){
		System.out.println(this.previous);
		System.out.println(this.current);
		temp = this.current;
		this.current = this.previous + this.current;
		this.previous = temp;
		}
		else{
			temp = this.current;
			System.out.println(this.current);
			this.current = this.previous + this.current;
			this.previous = temp;
			
		}
		fibonacci();
	}

}
