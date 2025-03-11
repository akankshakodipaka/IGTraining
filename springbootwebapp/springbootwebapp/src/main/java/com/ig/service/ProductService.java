package com.ig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ig.model.Product;
import com.ig.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	public void addProduct(Product product)
	{
		productRepository.addProduct(product);
	}
	public Product updateProduct(Integer id,Product product)
	{
		return productRepository.updateProduct(id, product);
	}
	public Product getProduct(Integer id)
	{
		return productRepository.getProduct(id);
	}
	public List<Product> getAllProduct()
	{
		return productRepository.getAllProduct();
	}
	public String deleteproduct(Integer id)
	{
		return productRepository.deleteProduct(id);
	}

}
