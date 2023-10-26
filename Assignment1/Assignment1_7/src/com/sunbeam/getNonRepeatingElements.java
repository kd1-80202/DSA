package com.sunbeam;

class getNonRepeatingElements {
	public static int getNonRepeatingElement(int arr[]) {
		for(int i=0;i<arr.length;i++) {
		  for(int j=0;j<arr.length;j++) {
			  if(arr[i]==arr[j]&&i!=j)
			  break;
			  
			  if(j==arr.length-1)
			      return arr[i];
		}
		
	}
	return -1;
	
	}
	


	public static void main(String[] args) {
		
		int arr[]= {1,2,3,-1,2,1,0,4,-1,7,8};
		int element=getNonRepeatingElement(arr);
		if(element!=-1)
			System.out.println("First non repeating element is"+element);
		else
		    System.out.println("No such element exist!");
	}

}
