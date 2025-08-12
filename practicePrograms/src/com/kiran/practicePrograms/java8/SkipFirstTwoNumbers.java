package com.kiran.practicePrograms.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirstTwoNumbers {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(2,6,87,90,3,45,56,0);
		
		//way-1
		List<Integer> skippedNumbers=numbers.stream().skip(2).collect(Collectors.toList());
		System.out.println(skippedNumbers);
		
		//way-2
		List<Integer> skippedNumbers2=numbers.subList(2, numbers.size());
		System.out.println(skippedNumbers2);

	}

}
