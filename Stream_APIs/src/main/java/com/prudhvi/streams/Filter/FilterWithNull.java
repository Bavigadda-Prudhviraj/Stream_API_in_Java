package com.prudhvi.streams.Filter;
import java.util.*;
import java.util.stream.Collectors;


public class FilterWithNull {

	public static void main(String[] args) {
		List<String> word=Arrays.asList("Bavigadda",null,"Prudhvi",null,"raj");
		List<String> name=new ArrayList<>();
		name=word.stream().filter(ele->ele!=null).collect(Collectors.toList());
		System.out.print(name);
		
	}

}
