package com.kiran.practicePrograms.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbers {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(2,6,87,90,3,45,56,0);
		
		//way-1
		List<Integer> sortedList=numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		//way-2
		Collections.sort(numbers);
		System.out.println(numbers);

	}

}
