package com.prudhvi.streams.extraMethods1;

import java.util.*;

//distict()
//count()-->terminal operator
//limit()

public class StreamMethods {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("raj","bavigadda","prudhvi","raj","prudhvi","lokesh","malli","ganesh");
		/*
		 ----->distinct()
		distinct() returns a stream consisting of distinct elements in a stream. 
		distinct() is the method of Stream interface. 
		This method uses hashCode() and equals() methods to get distinct elements.
		*/
		names.stream().distinct().forEach(ele->System.out.print(ele+" "));
		
		
	
		/*
		 ------>count()
		long count() returns the count of elements in the stream. 
		This is a special case of a reduction (A reduction operation takes a sequence of input elements and combines them into a single summary result by repeated application of a combining operation). 
		This is a terminal operation i.e, it may traverse the stream to produce a result or a side-effect. After the terminal operation is performed, the stream pipeline is considered consumed, 
		and can no longer be used.
		*/
		long len=names.stream().distinct().count();
		System.out.println("\n"+len);
		
		
		
		/*limit
		The limit(long N) is a method of java.util.stream.Stream object. 
		This method takes one (long N) as an argument and returns a stream of size no more than N. 
		limit() can be quite expensive on ordered parallel pipelines, if the value of N is large, 
		because limit(N) is constrained to return the first N elements in the encounter order and not just any n elements.
		*/
		names.stream().limit(3).forEach(ele->System.out.print(ele+" "));
		
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		//how many even numbers in the list
		long lenEven=list.stream().filter(ele->ele%2==0).count();
		System.out.println("\n"+list);
		System.out.println(lenEven);
		
		
		//min returns minimum values in the stream elements
		Optional<Integer> minNumber=list.stream().min((o1,o2)->{
										return o1.compareTo(o2);
									});
		System.out.println("Minimu values "+minNumber.get());
		
		//max returns the maximum elements in the stream
		Optional<Integer> maxNumber=list.stream().max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println("Maximum values "+maxNumber.get());
		
		//reduce-> will combain the collection
		/*
		 * reduce operation applies a binary operator to each element in the stream where the first argument to the operator is the return value of the previous application 
		 * and second argument is the current stream element
		 */
		List<String> strings=Arrays.asList("a","b","c","d","1","2","3");
		Optional<String> sum=strings.stream().reduce((value,combainValues)->{
			return combainValues+value;
		});
		System.out.println(sum.get());
		
		//toArray-> convert into array
		Object[] arr=strings.stream().toArray();
		System.out.println(arr.length);
		for(Object v:arr) {
			System.err.println(v);
		}
		
	}

}
