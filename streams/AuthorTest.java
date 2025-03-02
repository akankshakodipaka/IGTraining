package com.insight.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AuthorTest {
    public static void main(String[] args) {
        
        // Creating a list of Author objects and providing values
        List<Author> authors = new ArrayList<>();
        
        Author author1 = new Author();
        author1.setAdharCard(123456789L);
        author1.setFirstname("John");
        author1.setLastname("Doe");
        author1.setSurname("Doe");
        author1.setBirthdate(LocalDate.of(1990, 5, 15));
        author1.setGender("Male");
        author1.setCity("New York");
        author1.setMobile(9876543210L);
        
        Author author2 = new Author();
        author2.setAdharCard(987654321L);
        author2.setFirstname("Jane");
        author2.setLastname("Smith");
        author2.setSurname("Smith");
        author2.setBirthdate(LocalDate.of(1985, 8, 25));
        author2.setGender("Female");
        author2.setCity("Los Angeles");
        author2.setMobile(1234567890L);
        
        Author author3 = new Author();
        author3.setAdharCard(1122334455L);
        author3.setFirstname("Alice");
        author3.setLastname("Johnson");
        author3.setSurname("Johnson");
        author3.setBirthdate(LocalDate.of(1992, 7, 10));
        author3.setGender("Female");
        author3.setCity("New York");
        author3.setMobile(5555555555L);
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        System.out.println(authors);
        AuthorServiceImpl authorService = new AuthorServiceImpl();
        Set<String> uniqueSurnames = authorService.getUniqueSurnames(authors);
        System.out.println("Unique Surnames in Uppercase: " + uniqueSurnames);
        List<Author> authorsByCity = authorService.getAuthorsByCity(authors, "New York");
        System.out.println("Authors from New York: ");
        authorsByCity.forEach(a -> System.out.println(a.getFirstname() + " " + a.getLastname()));
        double averageFemaleAge = authorService.femaleAverageAge(authors);
        System.out.println("Average Female Age: " + averageFemaleAge);
        Long mobileByAdhar = authorService.getMobileByAdhar(authors, 987654321L);
        System.out.println("Mobile number by Aadhar: " + mobileByAdhar);
    }
}
