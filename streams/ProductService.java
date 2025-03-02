package com.insight.streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductService {

	public static void main(String[] args) {
			List<Product> productList = Arrays.asList(
		            new Product(1, "Milk", "dairy", 10.0, 50.0, LocalDate.of(2025, 5, 10)),
		            new Product(2, "Rice", "pulses", 20.0, 30.0, LocalDate.of(2025, 2, 20)),
		            new Product(3, "Sugar", "spices", 15.0, 25.0, LocalDate.of(2025, 3, 1)),
		            new Product(4, "Coconut Oil", "oils", 5.0, 75.0, LocalDate.of(2025, 2, 25)),
		            new Product(5, "Chips", "snacks", 50.0, 10.0, LocalDate.of(2025, 3, 5)),
		            new Product(6, "Chicken", "protien", 50.0, 10.0, LocalDate.of(2025, 3, 9))
		    );
			Optional<Product> high=productList.stream().max(Comparator.comparingDouble(Product::getPrice));
			high.ifPresent(x->System.out.println("Highest priced product: "+x.getName()+" at "+x.getPrice()));
			Optional<Product> low=productList.stream().min(Comparator.comparingDouble(Product::getPrice));
			low.ifPresent(x->System.out.println("Lowest priced product: "+x.getName()+" at "+x.getPrice()));
			LocalDate current=LocalDate.now();
			List<Product> exprDate=productList.stream().filter(x->x.getExpiryDate().isBefore(current)).collect(Collectors.toList());
			System.out.println(exprDate);
			LocalDate nextTen=current.plusDays(10);
			productList.stream().filter(x->x.expiryDate.equals(LocalDate.now().plusDays(10))).forEach(System.out::println);
//			List<Product> NexT=productList.stream().filter(x->!x.getExpiryDate().isBefore(current)&&x.getExpiryDate().isBefore(nextTen)).collect(Collectors.toList());
//			System.out.println(NexT);
			Map <String,Long> cnt=productList.stream().collect(Collectors.groupingBy(x->x.type,Collectors.counting()));
			cnt.forEach((type,count)->System.out.println(type+" "+count));
			
		// TODO Auto-generated method stub

	}

}
