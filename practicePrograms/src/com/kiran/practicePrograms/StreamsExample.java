package com.kiran.practicePrograms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamsExample {

	public static void main(String[] args) {
		List<Integer> li=List.of(4,4,2,5,2,132,78,98,11,98);
		
		//finding max element in list
		int max=li.stream().max(Integer::compare).orElseThrow();
		System.out.println(max);
		
		//finding Even numbers
		long totalEvenNumbers=li.stream().filter(n -> n%2==0).count();
		System.out.println(totalEvenNumbers);
		
		//finding Odd numbers
		long totalOddNumbers=li.stream().filter(n -> n%2!=0).count();
		System.out.println(totalOddNumbers);
		
		//convert all strings into upper
		List<String> st=List.of("kiran","kumar","phani");
		List<String> st1=st.stream().map(s -> s.toUpperCase()).toList();
		System.out.println(st1);
		
		//finding the letter starts with 'k
		List<String> st2=st.stream().filter(s -> s.startsWith("k")).toList();
		System.out.println(st2);
		
		//duplicates in list
		Set<Integer> set=new HashSet<Integer>();
		List<Integer> duplicates=li.stream().filter(n -> !set.add(n)).toList();
		System.out.println(duplicates);
		
		//get first 4 elements of list
		List<Integer> lim=li.stream().limit(4).toList();
		System.out.println(lim);
		
		//skip first 2 elements of list
		List<Integer> ski=li.stream().skip(4).toList();
		System.out.println(ski);
		
		//sum of all numbers in list
		
		int sum=li.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}
