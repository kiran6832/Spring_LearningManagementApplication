package com.kiran.practicePrograms.arrays;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] array= {3,7,1,88,32,99,0,35,65,95};
		
		//way-1
		Arrays.sort(array);
		for(int ele:array) {
			System.out.print(ele+" ");
		}
		System.out.println("\n----------------------------------");
		//way-2
		
		Arrays.stream(array).sorted().forEach(ele -> System.out.print(ele+" "));
	}

}
