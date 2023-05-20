package com.prudhvi.streams.flat_map;

import java.util.*;
import java.util.stream.Collectors;


public class FlatMap {

	public static void main(String[] args) {
		List<Integer> num1=Arrays.asList(1,2,3);
		List<Integer> num2=Arrays.asList(4,5,6);
		List<Integer> num3=Arrays.asList(7,8,9);
		//FlatMap deals with complex data like 2d arrayList,trees.etc
		
		List<List<Integer>> allList=Arrays.asList(num1,num2,num3);
		
		List<Integer> finalList=allList.stream()
				.flatMap(ele->ele.stream().map(n->n+10))
				.collect(Collectors.toList());
		System.out.print(finalList+"\n");
		
		//Another Example
		List<String> teamA=Arrays.asList("Bavigadda","Prudhvi","raj");
		List<String> teamB=Arrays.asList("lokesh","malli","Ganesh");
		List<String> teamc=Arrays.asList("jaswanth","prasanth","srikant");
		
		List<List<String>> all=Arrays.asList(teamA,teamB,teamc);
		
		List<String> allTeam=all.stream() //added the 2D ArrayList to the stream
				.flatMap(coll->coll.stream())// flatMap collect the all the list in 2D arrayList again we have to call the stream because flatMap returns the list of collections
				.collect(Collectors.toList());// collecting the single Names
		System.out.print(allTeam);

	}

}
