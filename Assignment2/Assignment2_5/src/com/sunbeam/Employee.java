package com.sunbeam;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;
	
	public Employee() {
		super();
		
	}

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n"+"SortEmployeeBinary [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void FurtherImprovedBubbleSort(Employee[] arr,int N) {
	    int count=0;
	    int passes=0;
	    int flag;
	    for(int i=1;i<N;i++) {
	    	passes++;
	    	flag=0;
	    	for(int j=0;j<N-i;j++) {
	    		count++;
	    		if(arr[j].getSalary()>arr[j+1].getSalary()){
	    		  Employee temp=arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;
	    			flag=1;
	    		}
	    	}
	    	if(flag==0)
	    	break;
	    }
	    System.out.println("No of comparisons:"+count);
		System.out.println("No of passes:"+passes);
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee[] arr=new Employee[3];
		
		
		arr[0]=new Employee(1,"Mayuri",50000);
		arr[1]=new Employee(2,"Ram",30000);
		arr[2]=new Employee(3,"Radha",40000);
		System.out.println("Employees array before sort by salary"+Arrays.toString(arr));
		
		FurtherImprovedBubbleSort(arr,arr.length);
        System.out.println("Employees Array after sort"+Arrays.toString(arr));
	}


}
