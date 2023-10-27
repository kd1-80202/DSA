package com.sunbeam;

import java.util.Arrays;

public class SelectionComparison {
	public static void SelectionSort(int arr[],int N) {
		int count=0;
		for(int i=0;i<N-1;i++) {
			
			for (int j=i+1;j<N;j++) {
				count++;
				
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
					
				}
			}
			
		}
		System.out.println("Number of comparisons"+count);	
		
	}

	public static void main(String[] args) {
		
		int arr[]= {44,11,55,22,66,33};
		System.out.println("Arrays Before sorting:"+Arrays.toString(arr));
		SelectionSort(arr,arr.length);
		System.out.println("Arrays after sort:"+Arrays.toString(arr));
		
		
	}

}
