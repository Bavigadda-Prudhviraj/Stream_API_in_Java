package com.prudhvi.streams.flat_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWithObjects {

	public static void main(String[] args) {
		List<Student> student1=Arrays.asList(
				new Student(1,"bavigadda", 'A'),
				new Student(2,"Prudvhi", 'B'),
				new Student(3,"raj", 'C')
				);
		List<Student> student2=Arrays.asList(
				new Student(4,"Lokesh", 'A'),
				new Student(5,"Malli", 'B'),
				new Student(6,"Ganesh", 'C')
				);
		//add this two collection into one bigger collection
		List<List<Student>> allList=Arrays.asList(student1,student2);
		List<String> studentNames=allList.stream()
				.flatMap(nam->nam.stream())
				.map(ele->ele.getName())
				.collect(Collectors.toList());
		System.out.print(studentNames);
	}

}
class Student{
	int id;
	String name;
	char grade;
	
	public Student(int id, String name, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
}