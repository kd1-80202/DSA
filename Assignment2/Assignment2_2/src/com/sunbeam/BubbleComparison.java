package com.sunbeam;

import java.util.Arrays;

public class BubbleComparison {
	
	public static void FurtherImprovedBubbleSort(int arr[],int N) {
		int count=0;
		int passes=0;
		int flag;
		for(int i=1;i<N;i++)
		{
			passes++;
			flag=0;
			for(int j=0;j<N-i;j++) {
				count++;
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
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
		int arr[]= {11,22,33,44,55,66};
		System.out.println("Arrays before sorted:"+Arrays.toString(arr));
		FurtherImprovedBubbleSort(arr,arr.length);
		System.out.println("Arrays after sort:"+Arrays.toString(arr));
	}

}
