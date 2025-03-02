package com.insight.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

	public static void main(String[] args) {
		InterviewRepository i=new InterviewRepository();
		//list candidate names from Pune city
		List<Candidate> list=i.getCandidateList();
		//System.out.println(list);
		System.out.println("List of Pune Candidates:");
		list.stream().filter(x->x.city.equalsIgnoreCase("Pune")).forEach(n->System.out.println(n));
		
		printLine();

		//list city and count of candidates per city
		System.out.println("Candidate count per city");
		Map<String,Long> perCity=list.stream().collect(Collectors.groupingBy(x->x.city,Collectors.counting()));
		perCity.forEach((city,count)->System.out.println(city+" "+count));
		printLine();

		//list technical expertise and count of candidates
		System.out.println("Candidate count by Technical Expertise");
		Map<String,Long> Texp=list.stream().collect(Collectors.groupingBy(x->x.course,Collectors.counting()));
		Texp.forEach((course,count)->System.out.println(course+" "+count));
		printLine();
		
		//list fresher candidates
		System.out.println("Fresher Candidate list");
		list.stream().filter(x->x.list==0).forEach(System.out::println);
		//listing candidates with highest experience
		printLine();
System.out.println("Sorted List of Candidates by Experience");
		Comparator<Candidate> exp=(n1,n2)->n1.list-n2.list;
		list.stream().sorted(exp).forEach(System.out::println);

		//sort the candidates by city name
		printLine();
		System.out.println("Sorted List of Candidates by City Name");
		Comparator<Candidate> city=(n1,n2)->n1.city.compareToIgnoreCase(n2.city);
		list.stream().sorted(city).forEach(System.out::println);
		//System.out.println("Sorted List of Candidates by City Name");
	}

	private static void printLine() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
	}
}

