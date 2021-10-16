package week1.day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] arr = {100,49,398,34,1,267};
		int length = arr.length; 
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		for(int j=0; j<arr.length; j++ ) {
			System.out.println(arr[j]);
		}
		
		System.out.println("the second largest number is" + arr[length-2]);
		System.out.println("the second smallest number is " +arr[1]);
	

	}

}
