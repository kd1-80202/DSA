package com.sunbeam;
/*
 * mplement menudriven program to maintain linked list of employees and provide below operations.
	i. Add employee (Perfrom any add operation)
	ii. Display all employees
	iii. Search employee by name
	iv. Delete employee by empid
	v. Update salary of employee
 */
public class Employee {
	int empid;
	String name;
	double salary;
	Employee next;
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.next=null;
		
	}
}
	class EmpolyeeLinkedList{
		Employee head;
		public void addEmployee(int empid, String name, double salary) {
			Employee nn=new Employee( empid,  name, salary);
		if(head==null)
			head=nn;
		else {
			Employee trav=head;
			while(trav.next!=null)
				trav=trav.next;
			trav.next=nn;
		}
		
		
	}
	public void displayEmployee() {
		Employee trav=head;
		System.out.println("List:");
		while(trav!=null) {
	System.out.println("Employee ID: " + trav.empid + ", Name: " + trav.name + ", salary: " + trav.salary);
		trav=trav.next;
			}
	}
	public void SearchEmployeeByName(String name) {
		if(head==null) {
			System.out.println("No Employee to search");
			return;
		}
		Employee trav=head;
		boolean found=false;
		while(trav!=null){
			if(trav.name.equals(name)) {
				found=true;
				System.out.println("Employee ID: " + trav.empid + ", Name: " + trav.name + ", salary: " + trav.salary);
				
			}
			trav=trav.next;
		}
		if(!found)
			System.out.println("Employee not found");
	}
	public void deleteEmployeeById(int empid) {
		if(head==null) {
			System.out.println("No Employee to delete");
		return;
	}
	if(head.empid==empid) {
		head=head.next;
		System.out.println("Employee deleted with id");
		return;
	}
	Employee trav=head;
	Employee next=null;
	boolean found =false;
	while(trav!=null){
	if(trav.empid==empid) {
		found=true;
		System.out.println("Employee ID: " + trav.empid + ", Name: " + trav.name + ", salary: " + trav.salary);
		
	}
	trav=trav.next;
	}
if(!found) {
	System.out.println("Employee not found");
	}
	}
	
	public void updateEmployeeSalary(int empid,  double newsalary) {
		if(head==null) {
			System.out.println("No Employee to update");
			return;
		}
		Employee trav=head;
		boolean found =false;
		while(trav!=null){
			if(trav.empid==empid) {
				found=true;
				trav.salary=newsalary;
				System.out.println("Employee ID: " + trav.empid + ", Name: " + trav.name + ", salary: " + trav.salary);
				trav=trav.next;
	      }
		}	
      }
	}
