package com.sunbeam;

import java.util.Scanner;

public class linear_search {
	
	public static int linearSearch(int arr[],int size,int key,int[] comparison) {
		 int comp=0;
		for(int i=0;i<size;i++) {
			comp++;
			if(arr[i]==key) {
				comparison[0]=comp;
				return comp;
		  }
	}
		
		return -1;
		
	}


	public static void main(String[] args) {
		int arr[]= {66,11,33,88,22,99,77,33};
		int comparison[]=new int[1];
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter key to be searched:");
        int  key=sc.nextInt();
        
        int index=linearSearch(arr,arr.length,key,comparison);
        if(index!=-1) 
        {
        	    System.out.println("key is found at index:"+index);
        	    System.out.println("number of comparisons:"+comparison[0]);
        }
        	else
        	       System.out.println("key is not found");
        	      
        	sc.close();
        
        }

}



