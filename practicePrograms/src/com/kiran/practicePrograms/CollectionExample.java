package com.kiran.practicePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class CollectionExample {

	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>();
		ls.add(4); //adding elements to list
		ls.add(6);  //adding elements to list
		ls.add(8);  //adding elements to list
		ls.add(3);  //adding elements to list
		ls.add(4);   //adding elements to list
		System.out.println(ls);
		ls.add(0,1);  //adding element at particular index
		System.out.println(ls);
		ls.remove(3);  //removing element from list using index
		System.out.println(ls);
		ls.remove((Object) 6);  //removing element by object
		System.out.println(ls);
		ls.remove(Integer.valueOf(3));
		System.out.println(ls);
		if(!ls.isEmpty()) {
			System.out.println(ls.get(0)); //accessing element when list is not empty
		}
		ls.set(0,2);   //replace element at particular index
		System.out.println(ls);
		System.out.println(ls.contains(2)); //checking the element present in list or not
		System.out.println(ls.isEmpty()); //checking list empty or not
		System.out.println(ls.size()); //prints size of list
		System.out.println(ls.indexOf(4)); //prints the first index of element 4
		System.out.println(ls.lastIndexOf(4));  //prints the last index of element 4
		System.out.println("------------------");
		Iterator<Integer> ls1=ls.iterator(); //traversing using iterator
		while(ls1.hasNext()) {
			System.out.println(ls1.next());
		}
		System.out.println("------------------");
		ListIterator<Integer> it = ls.listIterator(); //traversing using list_iterator on both sides
		while (it.hasNext()) {
			if(it.next()==4) {
				it.set(40);
			}
		}
		while (it.hasPrevious()) {
		    System.out.println(it.previous());
		}

		System.out.println("------------------");
		
		List<Integer> ls2=ls.stream() //stream operations
				.filter(n->n%4==0)
				.map(n->n-1)
				.collect(Collectors.toList());
		System.out.println(ls2);
		System.out.println("Original list: " + ls);
		System.out.println("Modified list (stream): " + ls2);
		System.out.println("------------------");
		for(int n:ls) {
			System.out.println(n);
		}
		System.out.println("------------------");
		System.out.println(ls.hashCode());
		System.out.println("--------------");
		List<Integer> li=List.of(2,6,8,0);
		ls.addAll(li);   //adding collection of elements to list
 		System.out.println(ls);
 		System.out.println("-----------------");
 		ls.removeAll(li); // remove collection of elements
 		System.out.println(ls);
 		ls.add(6);
 		ls.add(7);
 		System.out.println("-----------");
 		List<Integer> temp = List.of(6, 4);
 		ls.retainAll(temp); // Keep only matching
 		System.out.println(ls);
 		ls.add(7);
 		System.out.println("----------------");
 		Integer[] arr = ls.toArray(new Integer[0]);
 		System.out.println(Arrays.toString(arr));
         System.out.println("-------------------");
         int max = Collections.max(ls); //finding the max element of list
         int min = Collections.min(ls); //finding the min element of list
         System.out.println("max elemnt in list: "+max);
         System.out.println("max elemnt in list: "+min);

	}
}
