package com.kiran.practicePrograms.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {
	public static void main(String[] args) {
		int[] array1= {1,2,3,4,5,6,7};
		int[] array2= {8,9,10};
		
		// way-1
		int[] merged=new int[array1.length+array2.length];
		System.arraycopy(array1, 0, merged, 0, array1.length);
		System.arraycopy(array2, 0, merged, array1.length, array2.length);
		
		System.out.println(Arrays.toString(merged));
		
		//way-2
		
		int[] merged1=IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).toArray();
		
		System.out.println(Arrays.toString(merged1));
	}

}
