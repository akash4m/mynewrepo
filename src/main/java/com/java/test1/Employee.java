package com.java.test1;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private int age ;
	private double salary;
	
	Employee(String name,int age,double salary){
		this.name = name;
		this.age= age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee e1 = new Employee("akash", 24, 10500.23);
     Employee e2 = new Employee("taksh", 25, 12500.23);
     Employee e3 = new Employee("amar", 28, 14500.23);
     Employee e4 = new Employee("ashish", 23, 8500.23);
     List<Employee> emplist = new ArrayList<Employee>();
     emplist.add(e1);
     emplist.add(e2);
     emplist.add(e3);
     emplist.add(e4);
     
   /*  Collections.sort(emplist,new Comparator<Employee>(){
    	 public int compare(Employee o1, Employee o2) {
    			// TODO Auto-generated method stub
    			//return (int)(o1.getSalary() - o2.getSalary());
    			return o1.getName().compareTo(o2.getName());
    		}
    		
     });*/
     
     //Collections.sort(emplist,(o1,o2)-> o1.getName().compareTo(o2.getName()));
     
    // emplist.sort((o1,o2)-> o1.getName().compareTo(o2.getName()));
    
     // Comparator<Employee> r = Collections.reverseOrder(new salarycompare());
    // Collections.sort(emplist,r);
     Collections.sort(emplist);
     
   //  emplist.stream().filter(p -> p.getAge() > 0).map(Collator.)
    
     for(int i=0;i<emplist.size();i++){
    	 System.out.println(emplist.get(i).getAge());
     }
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}

}


