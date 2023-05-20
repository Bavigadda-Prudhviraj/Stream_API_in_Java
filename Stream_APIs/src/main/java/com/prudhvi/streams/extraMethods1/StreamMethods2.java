package com.prudhvi.streams.extraMethods1;
import java.util.*;


//sort
public class StreamMethods2 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,4,3,5,7,5,3,6,8,9,12,17,12);
		//Ascending order
		list.stream().sorted().forEach(s->System.out.print(s+" "));
		//Descending order
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s+" "));
		System.out.println();
		//String sorting
	List<String> names=Arrays.asList("srekanth","prasanth","jaswanth","ganesh","malli","lokesh","Bavigadda","Raj","Abhi","abhi","kalyan","raj");
	names.stream().sorted().forEach(s->System.out.print(s+" "));
	System.out.println("\n"+"decending");
	names.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s+" "));
	

	Set<String> set=new HashSet<>();
	set.add("one apple");
	set.add("one Mango");
	set.add("two apples");
	set.add("more grapes");
	set.add("two guavas");
	System.out.println();
	
	
	/* anyMatch->takes predicate return boolean
	 * Stream anyMatch(Predicate predicate) returns whether any elements of this stream match the provided predicate. 
	 * It may not evaluate the predicate on all elements if not necessary for determining the result. 
	 * This is a short-circuiting terminal operation. A terminal operation is short-circuiting if, 
	 * when presented with infinite input, it may terminate in finite time
	 */
	
	boolean result=set.stream().anyMatch(ele->{return ele.startsWith("one");});
	System.out.println(result);
	
	//all-match return true
	/*
	Stream allMatch(Predicate predicate) returns whether all elements of this stream match the provided predicate. 
	It may not evaluate the predicate on all elements if not necessary for determining the result. 
	This is a short-circuiting terminal operation. 
	A terminal operation is short-circuiting if, when presented with infinite input, it may terminate in finite time. 
	*/
	boolean result1=set.stream().allMatch(ele->{return ele.startsWith("one");});
	System.out.println(result1);
	
	//none match()
	/*
	The noneMatch() method in Java returns whether no elements of this stream match the provided predicate. 
	The true boolean value is returned if either no elements of the stream match the provided predicate or the stream is empty
	*/
	boolean result2=set.stream().noneMatch(ele->{return ele.startsWith("one");});
	System.out.println(result2);
	
	//findany()
	/*
	Stream findAny() returns an Optional (a container object which may or may not contain a non-null value) describing some element of the stream, or an empty Optional if the stream is empty.  
	findAny() V/s findFirst() :
	The findAny() method returns any element from a Stream but there might be a case where we require the first element of a filtered stream to be fetched. 
	When the stream being worked on has a defined encounter order(the order in which the elements of a stream are processed), 
	then findFirst() is useful which returns the first element in a Stream.
	*/
	Optional<String> someElemnt=set.stream().findAny();
	System.out.println(someElemnt.get());
	
	
	
	//findFirst()
	/*
	Stream findFirst() returns an Optional (a container object which may or may not contain a non-null value) 
	describing the first element of this stream, or an empty Optional if the stream is empty. 
	If the stream has no encounter order, then any element may be returned.
	*/
	Optional<String> firstElemnt=set.stream().findFirst();
	System.out.println(firstElemnt.get());
	
		
		

	}

}
