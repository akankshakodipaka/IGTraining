package com.insight.streams;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AuthorServiceImpl implements AuthorService {
	@Override
	public Set<String> getUniqueSurnames(List<Author> authorList){
		return authorList.stream().map(x->x.getSurname().toUpperCase()).collect(Collectors.toSet());
	}
	@Override
	public List<Author> getAuthorsByCity(List<Author>authorList,String city){
		return authorList.stream().filter(x->x.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
	}
	@Override
	public double femaleAverageAge(List<Author> authorList)
	{
		LocalDate currentDate=LocalDate.now();
		return authorList.stream().filter(x->"Female".equalsIgnoreCase(x.getGender())).mapToInt(x->Period.between(x.getBirthdate(),currentDate).getYears()).average().orElse(0.0);
	}
	@Override
	public Long getMobileByAdhar(List<Author> authorList,Long adharCard)
	{
		return authorList.stream().filter(x->x.getAdharCard().equals(adharCard)).map(Author::getMobile).findFirst().orElse(null);
	}
}
