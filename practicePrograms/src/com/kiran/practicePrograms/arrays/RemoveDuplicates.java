package com.kiran.practicePrograms.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] array= {1,2,3,3,4,5,5,6,7};
		
		// way-1
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<array.length;i++) {
			set.add(array[i]);
		}
		System.out.println(set);
		
		//way-2
		int[] withoutDuplicates=Arrays.stream(array).distinct().toArray();
		System.out.println(Arrays.toString(withoutDuplicates));
	}

}
