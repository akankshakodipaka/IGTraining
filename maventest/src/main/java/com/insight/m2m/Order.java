package com.insight.m2m;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name = "igorderm2m1")
public class Order  {
	@Id
	private int id;
	@Temporal(TemporalType.DATE)	//required for Date and Calendar Types
	@Column(name = "order_date")
	private Date purchaseDate;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "product_orders", joinColumns = { @JoinColumn(name = "order_id") }, inverseJoinColumns = { @JoinColumn(name = "product_id") })
	private Set<Product> products = new HashSet<>();	//required to avoid NullPointerException
	 public Order() {}
	public int getId() {		return id;	}

	public void setId(int id) {		this.id = id;	}

	public Date getPurchaseDate() {		return purchaseDate;	}

	public void setPurchaseDate(Date purchaseDate) {	this.purchaseDate = purchaseDate;	}

	public Set<Product> getProducts() {		return products;	}

	public void setProducts(Set<Product> products) {		this.products = products;	}
	public void addProduct(Product product) {		this.getProducts().add(product);	}
	
}