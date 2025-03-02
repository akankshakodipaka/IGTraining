package com.insight.streams;

public class Candidate {
	String name;
	String course;
	String city;
	Integer list;
	public Candidate(String name, String course, String city, Integer list) {
		super();
		this.name = name;
		this.course = course;
		this.city = city;
		this.list = list;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", course=" + course + ", city=" + city + ", list=" + list + "]";
	}
	
}
