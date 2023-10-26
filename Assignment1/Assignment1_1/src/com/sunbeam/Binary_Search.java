package com.sunbeam;

public class Binary_Search {
	
	public static int binarySearch(int arr[],int size,int key) {
		int cnt=0;
		int left=0;int right=size-1,mid;
		while(left<=right) {
			
			mid=(left+right)/2;
			cnt++;
			if(key==arr[mid]) {
				
				return cnt;
			}
			else if(key<arr[mid])
				right=mid-1;
			else
				left=mid+1;
			
		
			
		}
		return -1;	
	}
		

		public static void main(String[] args) {
			int arr[]= {11,22,33,44,55,66,77,88};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter key to be searched:");
			int key=sc.nextInt();
			int cnt=binarySearch(arr,arr.length,key);
		
				System.out.println("Number of comparisons:"+cnt);
			
			sc.close();

		}

	}

}
