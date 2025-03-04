package com.insight.m2m;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="igproductm2m1")
public class Product  {
	@Id
	private int id;
	private String name;
	private double price;
	public Product() {}
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="products")
	private Set<Order> orders = new HashSet<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {		this.id = id;	}

	public String getName() {		return name;	}

	public void setName(String name) {		this.name = name;	}

	public double getPrice() {		return price;	}

	public void setPrice(double price) {		this.price = price;	}

	public Set<Order> getOrders() {		return orders;	}

	public void setOrders(Set<Order> orders) {		this.orders = orders;
	}
}

