package com.ig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ig.model.Product;
import com.ig.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	//@RequestMapping(value="/helloproduct",method=RequestMethod.GET)
	@GetMapping("/helloproduct")
	public String hello() {
		return "helloproduct";
	}
	//@RequestMapping(value="/add",method=RequestMethod.POST)
	@PostMapping("/add")
	public String addProduct(@RequestBody Product product) {
		productService.addProduct(product);
		return "add product is succes";
	}
	//@RequestMapping(value="/update",method=RequestMethod.PUT)
	@PutMapping("/update/{id}")
	public Product updateProduct(@PathVariable("id") Integer id,@RequestBody Product product) {
		return productService.updateProduct(id,product);
	}
	//@RequestMapping(value="/read",method=RequestMethod.GET)
	@GetMapping("/read/{id}")
	public Product readProduct(@PathVariable("id") Integer id) {
		return productService.getProduct(id);
	}
	@GetMapping("/readall")
	public List<Product> readAllProduct() {
		return productService.getAllProduct();
	}
	//@RequestMapping(value="/delete",method=RequestMethod.POST)
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable("id") Integer id) {
		return productService.deleteproduct(id);
	}
	

}
