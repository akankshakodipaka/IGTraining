package com.insight.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
	
	public CarServiceImpl() {
		//super();
	}
	@Override
	public double sumOfPrices(List<Car> carList) {
		return carList.stream().mapToDouble(x->x.getPrice()).sum();
	}
	@Override
	public List<String> getCarNames(List<Car> carList){
		return carList.stream().map(x->x.getCarName()).collect(Collectors.toList());
	}
	@Override
	public Set<String> getCarMakers(List<Car> carList){
		return carList.stream().map(x->x.getCareMake()).collect(Collectors.toSet());
	}
	@Override
	public double getHighPricedCar(List<Car> carList) {
		return carList.stream().mapToDouble(Car::getPrice).max().orElse(0.0);
		
	}
	@Override
	public Car getCarWithLowPricedCar(List<Car> carList) {
		return carList.stream().min(Comparator.comparingDouble(Car::getPrice)).orElse(null);
	}

}
