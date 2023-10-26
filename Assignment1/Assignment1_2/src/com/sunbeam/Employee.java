package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;
	

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
		
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
	public int hashCode() {
		return Objects.hash(empid, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     Employee[] emp=new Employee[3];
     
     emp[0]=new Employee(1,"e1",2000);
     emp[1]=new Employee(2,"e2",3000);
     emp[2]=new Employee(3,"e3",4000);
     
     System.out.println("Enter id to search=");
     int id=sc.nextInt();
     for(int i=0;i<emp.length;i++) {
     	  if(id ==emp[i].empid){
     		 System.out.println("**By id"); 
     		 System.out.println("index of id:"+i);
     		 System.out.println(emp[i]);
     		 break;
     	  }
       }
         
     
     System.out.println("Enter name to search=");
    String name=sc.next();
    for(int i=0;i<emp.length;i++)
    {
    	if(name.equals(emp[i].name)) {
    		System.out.println("**By name**");
    		System.out.println("index of name"+i);
    		System.out.println(emp[i]);
    		break;
    	}
    }
    System.out.println("Enter name to salary=");
    double salary=sc.nextDouble();
    
  for ( int i=0;i<emp.length;i++ ){
	if(salary==emp[i].salary) {
		System.out.println("**by salary**");
		System.out.println("index of salary"+i);
		System.out.println(emp[i]);
	}
		
	}
  }
	}


