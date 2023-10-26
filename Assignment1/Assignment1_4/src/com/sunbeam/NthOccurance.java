package com.sunbeam;

import java.util.Scanner;

public class NthOccurance {

	
		public static int linearSearch(int arr[],int size,int key,int occurance) {
			int counter=0;
			for(int i=0;i<size;i++) {
				if(arr[i]==key)
				counter++;
				if(counter==occurance) {
					return i;
				}
					
				
			}
			return -1;
			
			
			
			
		}
		public static void main(String[] args) {
			
			int arr[]= {1,2,3,2,3,4,3,5,6};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter element of which nth occurance is to find:");
			int ele=sc.nextInt();
			System.out.println("Enter no of occurance to find the key");
			int occur=sc.nextInt();
			int index=linearSearch(arr,arr.length,ele,occur);
			if(index!=-1) {
			System.out.println("element is found at index: "+index);
	
			}
			else
				System.out.println("key is not found");
			
			
	}
		
		

}
