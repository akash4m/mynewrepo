package com.java.test;

public class MyStack {

	int maxsize;
	int [] MyStack ;
	int top = -1;
	
	public MyStack(int maxsize){
		this.MyStack = new int[maxsize];
		this.maxsize = maxsize;
	}
	
	public void push(int i){
		if(MyStack.length > maxsize){
			throw new StackOverflowError();
		}else{
			MyStack[++top] = i;
		}
	}
	
	public int pop(){
		if(top<0){
			throw new RuntimeException();
		}else{
			return MyStack[top--];
		}
	}
	
	public int peek(){
		return MyStack[top];
	}
}
