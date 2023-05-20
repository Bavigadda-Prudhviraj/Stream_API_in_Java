package com.prudhvi.streams.Filter;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterWithMultipleCondition {

	public static void main(String[] args) {
		List<String> name=Arrays.asList("raj","Bavigadda","Prudhvi","Kalyan","Lokesh","malli","Ganesh","Shaik","Hemanth","Prince");
		//filter the names length is >3 and less <5
		List<String> lenName=new ArrayList<>();
		lenName=name.stream().filter(nam->nam.length()>=3 && nam.length()<=5).collect(Collectors.toList());
		System.out.print(lenName);
		name.stream().filter(ele->ele.length()>5).forEach(Sys->System.out.print(Sys+" "));
	}

}
