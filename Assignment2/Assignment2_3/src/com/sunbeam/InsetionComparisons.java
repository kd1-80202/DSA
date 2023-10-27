package com.sunbeam;

import java.util.Arrays;

public class InsetionComparisons {
	
	public static void insersionComparisons(int arr[],int N) {
		int count=0;
		for(int i=1;i<N;i++) {
		
			int temp=arr[i];
			int j=i-1;
			while(j>=0 ){
				count++;
            if(arr[j]>temp ) {
				
				arr[j+1]=arr[j];
				j--;
            }
		else
		  break;
          
			}
			arr[j+1]=temp;
		}	
		System.out.println("No of comprisons:"+count);
	}

	public static void main(String[] args) {
		int arr[]= {55,44,22,66,11,33};
		System.out.println("Arrays Before sort:"+Arrays.toString(arr));
		insersionComparisons(arr,arr.length);
		System.out.println("Arrays After sort:"+Arrays.toString(arr));
	
	
	
	
	}

}
