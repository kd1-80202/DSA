package com.sunbeam;

import java.util.Scanner;

public class ListMain {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 EmpolyeeLinkedList list = new EmpolyeeLinkedList();

	        int choice;
	        do {
	            System.out.println("\nEmployee Management System");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Display all Employees");
	            System.out.println("3. Search Employee by Name");
	            System.out.println("4. Delete Employee by ID");
	            System.out.println("5. Update Employee Salary");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Employee ID: ");
	                    int empid = sc.nextInt();
	                    System.out.print("Enter Employee Name: ");
	                    sc.nextLine();
	                    String name = sc.nextLine();
	                    System.out.print("Enter Employee Salary: ");
	                    double salary = sc.nextDouble();
	                    list.addEmployee(empid, name, salary);
	                    break;
	                case 2:
	                    list.displayEmployee();
	                    break;
	                case 3:
	                    System.out.print("Enter Employee Name to search: ");
	                    String findname=sc.next();
	                    String searchName = sc.nextLine();
	                    list.SearchEmployeeByName(findname);
	                    break;
	                case 4:
	                    System.out.print("Enter Employee ID to delete: ");
	                    int deleteId = sc.nextInt();
	                    list.deleteEmployeeById(deleteId);
	                    break;
	                case 5:
	                    System.out.print("Enter Employee ID to update salary: ");
	                    int updateId = sc.nextInt();
	                    System.out.print("Enter new Salary: ");
	                    double newSalary = sc.nextDouble();
	                    list.updateEmployeeSalary(updateId, newSalary);
	                    break;
	                case 0:
	                    System.out.println("Exiting the system...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	                    break;
	            }
	        } while (choice != 0);

	        sc.close();
	    }

	}


