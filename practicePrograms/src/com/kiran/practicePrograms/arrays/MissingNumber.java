package com.kiran.practicePrograms.arrays;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] array= {1,2,4,5,6};
		int n=array.length+1;
		int totalSum=n*(n+1)/2;
		
		// way-1
		int actualSum=0;
		for(int i=0;i<array.length;i++) {
			actualSum+=array[i];
		}
		System.out.println("Missing Number is: "+(totalSum-actualSum));
		
		//way-2
		int sum=Arrays.stream(array).sum();
		
		System.out.println("Missing Number is: "+(totalSum-sum));

	}

}
