package com.kiran.practicePrograms.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//printing the even numbers from a list of numbers using java8 features
public class EvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,4,8,5,9,46,78);
		
		//way-1
		List<Integer> li=numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
		System.out.println(li);
		
		//way-2
		List<Integer> evenNumbers=new ArrayList<>();
		for(Integer even:numbers) {
			if(even%2==0) {
				evenNumbers.add(even);
			}
		}
		System.out.println(evenNumbers);
		

	}

}
