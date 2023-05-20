package com.prudhvi.streams.parallemstreams;

import java.util.*;
import java.util.stream.Collectors;

public class ParallemStream {

	public static void main(String[] args) {
		List<Student> students=Arrays.asList(
				new Student("prudhvi1", 10),
				new Student("prudhvi2", 20),
				new Student("prudhvi3", 30),
				new Student("prudhvi4", 40),
				new Student("prudhvi5", 50),
				new Student("prudhvi6", 60),
				new Student("prudhvi7", 70),
				new Student("prudhvi8", 80),
				new Student("prudhvi9", 90));
		//System.out.print(students);
		
		//Note:- normal stream sequential process
		students.stream().filter(n->n.getScore()>50).limit(3).forEach(n->System.out.println(n.getName())); //collect(Collectors.toList())
		
		System.out.print("parallel Stream"+"\n");
		//Parallel Stream observation here order is different
		students.parallelStream().filter(n->n.getScore()>50).limit(3).forEach(n->System.out.println(n.getName()));
		
		//we can convert normal stream into parallel Stream
		//for this we have to use parallel() method
		students.stream().parallel().filter(n->n.getScore()>50).limit(3).forEach(n->System.out.println(n.getName()));
		
	}

}

