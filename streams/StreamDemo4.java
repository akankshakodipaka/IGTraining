package com.insight.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
	public static boolean palindrome(String s)
	{
		return true;
	}
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(-9,-18,0,25,4);
		Integer min=list.stream().min(Integer::compare).get();
		System.out.println("min: "+min);
		Integer max=list.stream().max(Integer::compare).get();
		System.out.println("Max: "+max);
		Stream<String> s=Stream.of("3","4","5");
		double ans=s.collect(Collectors.averagingDouble(num -> Double.parseDouble(num)));
		System.out.println("Double average :"+ans);
		Stream<String> s1=Stream.of("3","4","5");
		double ans1=s1.collect(Collectors.averagingInt(num->Integer.parseInt(num)));
		System.out.println("Integer average :"+(int)ans1);
		List<Integer> l2=Arrays.asList(20,30,11,18,29,10,123,198);
		l2.stream().filter(x->String.valueOf(x).startsWith("1")).forEach(System.out::println);
		String name="insightglobal";
		Map<Character,Long> res=name.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		res.forEach((chara,count)->System.out.println(chara+" : "+count));
		List<String> palindromeList=Arrays.asList("madam","liril","aba","tomato","apple");
		String res1=palindromeList.stream().filter(x->x.equals(new StringBuilder(x).reverse().toString())).min(Comparator.comparingInt(String::length)).orElse("No Palindrome found");
		System.out.println("Shortest Palindrome : "+res1);
		
		
		
	}
}
