package com.insight.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args)
	{
		Stream s=Stream.of(2,1,3,4,5,2,7,8,3,4,5,2,3,4);
		s.forEach(x-> System.out.print(x));
		System.out.println("\n Method ref");
		List<Integer> list=Arrays.asList(2,1,3,4,5,2,7,8,3,4,5,2,3,4);
		list.stream().forEach(System.out::print);
		System.out.println("\n Distinct");
		list.stream().distinct().forEach(System.out::print);
		System.out.println("\n == below 5 ,unique,");
		list.stream().filter(x->x<=5).distinct().limit(2).forEach(System.out::println);
		list.parallelStream().skip(3).filter(x->x<=5).distinct().limit(2).forEach(System.out::print);
		list.stream().limit(5).map(x->Math.pow(x,2)).forEach(System.out::println);
		System.out.println("Sorted order");
		list.stream().limit(5).sorted().forEach(System.out::println);
		System.out.println("Reverse Sorted order");
		list.stream().limit(5).sorted(Collections.reverseOrder()).forEach(x->System.out.println(x));
		System.out.println("== Count ==");
		long count=list.stream().filter(x->x%2==0).count();
		System.out.println(count);
		System.out.println("== Sum ==");
		int sum=list.stream().limit(5).reduce((a,b)->a+b).get();
		System.out.println(sum);
		
		
		
	}

}
