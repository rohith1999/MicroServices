package com.mithran.doorfront.productservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.mithran.doorfront.productservice.model.Product;
import com.mithran.doorfront.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;

/**
 * 
 * Manages requests and response for all REST APIs ProductController can get
 * list of all products and can add products to mongoDB database
 * 
 * @author Rohith S
 */
@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

	/**
	 * productService is an interface which has all the functionalities that needs
	 * to be implemented productService has findAll() and createProduct()
	 * functionality
	 */
	private final ProductService productService;

	/**
	 * findAll() method returns a list of all the products saved in mongoDB
	 * 
	 * @return List<Product>
	 */
	@GetMapping("/getallproducts")
	@ResponseStatus(HttpStatus.OK)
	public List<Product> findAll() {
		return productService.findAll();
	}

	/**
	 * createProduct adds a product to the mongoDB
	 * 
	 * @param product (product has id, name, description, price)
	 */
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody Product product) {
		productService.createProduct(product);

	}

}
