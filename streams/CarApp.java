package com.insight.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CarApp {
	public static void main(String[] args)
	{
		Car cars[]= {
				new Car("Maruti","Swift Dezire",810000.00),
				new Car("Hyundai","Verna",1100000.00),
				new Car("Toyota","Innova",2450000.00),
				new Car("Audi","Q3",4500000.00)
		};
        List<Car> carList = new ArrayList<>(Arrays.asList(cars));
        CarService carService = new CarServiceImpl();
        try {
        	System.out.println(carList);
            double sumPrices = carService.sumOfPrices(carList);
            System.out.println("Sum of Prices: " + sumPrices);
            List<String> carNames = carService.getCarNames(carList);
            System.out.println("Car Names: " + carNames);
            Set<String> carMakers = carService.getCarMakers(carList);
            System.out.println("Car Makers: " + carMakers);
            double highestPrice = carService.getHighPricedCar(carList);
            System.out.println("Highest Priced Car: " + highestPrice);
            Car lowestPricedCar = carService.getCarWithLowPricedCar(carList);
            if (lowestPricedCar != null) {
                System.out.println("Car with Lowest Price: " + lowestPricedCar);
            } else {
                System.out.println("No car found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
