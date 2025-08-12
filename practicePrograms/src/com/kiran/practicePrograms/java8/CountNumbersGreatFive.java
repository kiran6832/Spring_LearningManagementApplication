package com.kiran.practicePrograms.java8;

import java.util.Arrays;
import java.util.List;

public class CountNumbersGreatFive {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(2,6,87,90,3,45,56,0);
		
		//way-1
		long count=numbers.stream().filter(n-> n>5).count();
		System.out.println(count);
		//way-2
		int count2=0;
		for(int num:numbers) {
			if(num>5) {
				count2+=1;
			}
		}
		System.out.println(count2);

	}

}
