package com.kiran.practicePrograms.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Max value from list
public class MaxValue {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(2,6,87,90,3,45,56,0);
		//way-1
		Optional<Integer> maxValue=numbers.stream().max(Integer::compare);
		System.out.println(maxValue.orElse(null));
		//way-2
		int max=Integer.MIN_VALUE;
		for(int num:numbers) {
			if(max<num) {
				max=num;
			}
		}
		
		System.out.println(max);

	}

}
