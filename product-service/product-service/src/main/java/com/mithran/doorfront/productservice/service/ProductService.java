package com.mithran.doorfront.productservice.service;

import com.mithran.doorfront.productservice.model.Product;
import java.util.List;

/**
 * ProductService is an interface that has a list of all functionalities that
 * needs to be implemented
 * 
 * @author Rohith S
 *
 */
public interface ProductService {

	/**
	 * findAll() method returns a list of all the products saved in mongoDB
	 * 
	 * @return List<Product>
	 */
	public List<Product> findAll();

	/**
	 * createProduct adds a product to the mongoDB
	 * 
	 * @param product (product has id, name, description, price)
	 */
	public void createProduct(Product product);

}
