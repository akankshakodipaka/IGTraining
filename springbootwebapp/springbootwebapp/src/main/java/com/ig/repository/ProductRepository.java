package com.ig.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ig.model.Product;

@Repository
public class ProductRepository {
	static ArrayList<Product> productList=new ArrayList<>();
	public void addProduct(Product product)
	{
		productList.add(product);
	}
	public Product updateProduct(Integer id1,Product product)
	{
		Product p=new Product();
		for(Product p1:productList)
		{
			if(p1.id==id1)
			{
				p.setId(product.getId());
				p.setName(product.getName());
				p.setPrice(product.getPrice());
			}
		}
		return p;
	}
	public Product getProduct(Integer id1)
	{
		Product p=new Product();
		for(Product p1:productList)
		{
			if(p1.id==id1)
			{
				p.setId(p1.getId());
				p.setName(p1.getName());
				p.setPrice(p1.getPrice());
			}
		}
		return p;
	}
	public List<Product> getAllProduct(){
		return productList;
	}
	public String deleteProduct(Integer id)
	{
		productList.removeIf(x->x.getId()==id);
		return "delete succes";
	}

}
