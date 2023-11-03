
import java.util.Arrays;

import java.util.Stack;
//Create an array of integers. Reverse the array using stack
public class ReverseArrayByStack {

	public static void main(String[] args) {
	int []arr= {11,22,33,44,55};
			Stack<Integer> st = new Stack<>();
			int i;
				
					for( i=0;i<arr.length;i++) 
					st.push(arr[i]);
					
					for(i=0;i<arr.length;i++)
					arr[i]=st.pop();
					
					
						System.out.println("Reversed Array = " + Arrays.toString(arr));
	}

	}


