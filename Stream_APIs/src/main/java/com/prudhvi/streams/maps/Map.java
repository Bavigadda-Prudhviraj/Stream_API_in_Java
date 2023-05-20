package com.prudhvi.streams.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		List<String> vList=Arrays.asList("car","bus","bike","flight","train");
		List<String> upperCaseList=new ArrayList<>();
		
		//convert all lower case into upper case
		upperCaseList=vList.stream()
				.map(ele->ele.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(upperCaseList);
		
		// create an arrayList add the length of each string in arrayList
		List<Integer> lenList=new ArrayList<>();
		lenList=vList.stream()
				.map(ele->ele.length())
				.collect(Collectors.toList());
		System.out.println(lenList);
		
		//multiple every number with 3 and print
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.print(num+"\n");
		num.stream().map(nums->nums*3).forEach(nums->System.out.print(nums+" "));
	}

}
