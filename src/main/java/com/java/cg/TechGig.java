package com.java.cg;

public class TechGig {

	public static void main(String[] args) {
		
		
		System.out.println( appearanceCount(4,11,"cAda","AbrAcadAbra"));
		//System.out.println(factorial(4));

	}
    
	 public static int appearanceCount(int input1,int input2,String input3,String input4)
	    {
		 int totalPossible = factorial(input1);
		 String []  arr = new String[totalPossible];
		 for(int i=0;i<totalPossible;i++){
			 arr[i] = "";
		 }
		    return 0;
	    }
	 
	 public static int factorial(int no){
		 int result = 1 ;
		 for(int i = no;i>=1;i--){
			 result = result * i;
		 }
		 return result;
	 }
	 
	public static void totalCombination(int input1,String input3,int totalPossible){
		
		char [] charArray = input3.toCharArray();
		
		for(int i=0;i<charArray.length;i++){
			char [] realChar = new char[input1];
			for(int j=0;j<charArray.length;j++){
				if(i == j){
					realChar[j] = charArray[j];
				}else{
					realChar[j-1] = charArray[i];
				}
			}
		}
	}
}
