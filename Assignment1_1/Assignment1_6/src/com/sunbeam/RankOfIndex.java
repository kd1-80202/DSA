package com.sunbeam;

import java.util.Scanner;

public class RankOfIndex {
	public static  int linearSearch(int arr[],int size,int key) {
		int rank=0;
		for(int i=0;i<size;i++) {
			
			if(arr[i]<=key)
				rank++;
				
		}
	
		return rank;
		
		
	}
	
	

	public static void main(String[] args) {
		int arr[]= {10,20,15,3,4,4,1};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element whose rank is to find");
		int key=sc.nextInt();
		int rank=linearSearch(arr,arr.length,key);
		if(rank!=-1)
			System.out.println("key is found at rank:"+rank);
		else
			System.out.println("key is not found");
 sc.close();
	}

}
