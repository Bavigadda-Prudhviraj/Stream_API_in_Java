package com.prudhvi.streams.Filter;

import java.util.*;
import java.util.stream.Collectors;


public class Filter_intro {

	public static void main(String[] args) {
		//declaring the collection
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(15);
		arrayList.add(20);
		arrayList.add(25);
		arrayList.add(30);
		arrayList.add(35);
		
		//Shortcut for creating array list using asList
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//filter the even Numbers add the to another list
		List<Integer> evenList=new ArrayList<Integer>();
		
		/* Note:- Streams
		 * 1. add the collection to Stream
		 * 2.Stream will have stream function
		 * 3.filter will take predicate return boolean values
		 */
		//1.collected the data into the stream
		//2.filter the data base on the condition
		//3.add the data into collct.collectors.asList it will convert the data into list format
		//4.it return that list that resulted list is added to the collection
		evenList=num.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Even List : "+ evenList);
		
		//direct print the data using forEach it takes consumer(in lambda expression notes) or iterating
		arrayList.stream().filter(n->n%2==0).forEach(ele->System.out.print(ele+" "));
		//Another method SysOut
		System.out.println();
		num.stream().filter(n->n%2!=0).forEach(System.out::print);
		
		
		 
		
		

	}

}
