package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class Bnp {

	static Map<Employee,String> testMap= new HashMap<Employee,String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Employee e1 = new Employee("akash",24,10023986);
		Employee e2 = new Employee("akash",25,10023986);
		Employee e3 = new Employee("mukesh",28,10023984);
		Employee e4 = new Employee("pankaj",27,10023983);
		
		testMap.put(e1, "justdial");
		testMap.put(e2, "justdial");
		testMap.put(e3, "gupshup");
		testMap.put(e4, "wessin");
		
		System.out.println(testMap.get(e1));
		
		
		//e1.setAge(25);
		
		System.out.println(testMap.get(e1));
		
	}

}


class Employee{

	private String name ;
	private Integer age;
	private Integer empId;
	
	 Employee(String name, Integer age , Integer EmpId){
		this.name = name;
		this.age = age;
		this.empId = EmpId;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Integer getAge(){
		return this.age;
	}
	
	public Integer getEmpId(){
		return this.empId;
	}
	
	public  boolean equals(Object obj) {
        if (this == obj ){
        	if(this.name.equals(((Employee)obj).getName()) && this.empId.intValue() == ((Employee)obj).getEmpId().intValue()){
        		return true;
        	}
       }
        return false;
    }
	
	public  int hashCode(){
		int result = 0;
		result = result +  (this.name == null ? 0 : this.name.hashCode());
		result = result +  (this.age == null ? 0 : this.age.hashCode());
		result = result +  (this.empId == null ? 0 : this.empId.hashCode());
		
		return result;
	}
}

class SuperEmployee extends Employee{

	SuperEmployee(String name, Integer age, Integer EmpId) {
		super(name, age, EmpId);
		// TODO Auto-generated constructor stub
	}
	
	
}
