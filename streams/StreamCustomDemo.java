package com.insight.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Account{
	Integer id;
	String name;
	Double balance;
	public Account(Integer id, String name, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
public class StreamCustomDemo {
	public static void main(String[] args)
	{
		List<Account> accountList=Arrays.asList(new Account(897,"ram",90000.00),new Account(297,"kiran",30000.00),new Account(847,"Amith",10000.00),new Account(197,"ram",80000.00),new Account(323,"bindu",70000.00));
		accountList.stream().map(a->a.name).forEach(n->System.out.println(n));
		List<Double> newList=accountList.stream().map(a->a.balance+500).collect(Collectors.toList());
		newList.forEach(System.out::println);
		Comparator<Account> nameComp=(n1,n2)->n1.name.compareTo(n2.name);
		accountList.stream().sorted(nameComp).forEach(System.out::println);
		Comparator<Account> idComp=(n1,n2)->n1.id-n2.id;
		accountList.stream().sorted(idComp).forEach(System.out::println);
		Comparator<Account> balanceComp=(n1,n2)->n1.balance.intValue()-n2.balance.intValue();
		accountList.stream().sorted(balanceComp).forEach(System.out::println);
		
		
	}

}
