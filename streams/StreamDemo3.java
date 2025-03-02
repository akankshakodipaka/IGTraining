package com.insight.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo3 {
	public static void main(String[] args)
	{
		List<String> name=Arrays.asList("chinnu","ajay","puppy","ammulu","raju","jaanu");
		name.stream().map(x->x.length()).forEach(n->System.out.println(n));
		name.stream().map(x->x.toUpperCase()).forEach(n->System.out.println(n));
		System.out.println("Sorted list");
		name.stream().sorted().forEach(n->System.out.println(n));
		System.out.println("names lengthwise sorted list");
		Comparator<String> comp=(n1,n2)->n2.length()-n1.length();
		name.stream().sorted(comp).forEach(n->System.out.println(n));
		name.stream().filter(n->n.equals("chinnu")).forEach(x->System.out.println(x));
		name.stream().filter(n->n.endsWith("u")).forEach(x->System.out.println(x));
		
		
		
		
		
	}

}