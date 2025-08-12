package com.kiran.practicePrograms.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(2,6,2,87,3,6,6,90,3,45,56,0);
		//way-1
		List<Integer> distinctNumbers=numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNumbers);
		//way-2
		List<Integer> distinctNumbers2=new ArrayList<>();
		for(int num:numbers) {
			if(!distinctNumbers2.contains(num)) {
				distinctNumbers2.add(num);
			}
		}
		System.out.println(distinctNumbers2);
	}

}
