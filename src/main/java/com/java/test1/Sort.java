package com.java.test1;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //  reverse("fuckyou");
		//wellthy();
		replace("akash", 'k');
	}
	
	public static void wellthy(){
		String array [] = {"front","end","back","foo","bizz"};
		String str = "foofront";
		String temp = "";
		
		for(String s:array){
			if(str.indexOf(s) > -1){
				temp = temp+s;
			}
		}
		
		if(temp.length() == str.length()){
			char [] c1 = temp.toCharArray();
			char [] c2 = str.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if((new String(c1).equals(new String(c2)))){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}else{
			System.out.println("false");
		}
				
	}
	
	
	public static void reverse(String data){
		char [] array = data.toCharArray();
		char [] temparray = new char[array.length];
		for(int i=0;i<array.length;i++){
			temparray[i] = array[array.length - i-1];
		}
		String s = new String(temparray);
		System.out.println(s);
	}
    
	public static void dosort(){
		System.out.println("enter the lenght of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<size;i++){
			System.out.println("enter "+i+" the element");
			array[i] = sc.nextInt();
		}
		
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				int temp = 0;
				if(array[i] < array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j]  = temp;
				}
			}
		}
		
		System.out.println("sorted array");
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
		
	}
	
	public static int fibonacci(int number){
		if(number == 1 || number == 2){
			return 1;
		 } 
		return fibonacci(number-1) + fibonacci(number -2); 
	}

	public static void replace(String str, char ch){
		
	 char [] carr = str.toCharArray();
	
	 char [] arr = new char[carr.length];
	 
	 int j = 0;
	 for(char c : carr){
		 if(c == ch){
			
		 }else{
			arr[j] = c;
			j++;
		 }
		 
	 }
	 
	 System.out.println(new String(arr));
		
	}
}
