package com.prudhvi.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ConcatinatingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("srekanth","prasanth","jaswanth","ganesh","malli","lokesh","Bavigadda","Raj","Abhi","abhi","kalyan","raj");
		List<String> set=new ArrayList<>();
		set.add("one apple");
		set.add("one Mango");
		set.add("two apples");
		set.add("more grapes");
		set.add("two guavas");
		
		Stream<String> stream1=names.stream();
		Stream<String> stream2=set.stream();
		
		List<String> all=Stream.concat(stream1, stream2).collect(Collectors.toList());
		
		System.out.print(all);
		
	}

}
