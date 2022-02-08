package com.mithran.doorfront.productservice.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mithran.doorfront.productservice.model.Product;
import com.mithran.doorfront.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

/**
 * ProductServiceImpl implements the business logic for all the unimplemented
 * methods in ProductService
 * 
 * @author Rohith S
 *
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	/**
	 * ProductRepository communicates with the mongoDB to perform CRUD operations
	 */
	private final ProductRepository productRepository;

	/**
	 * findAll() method returns a list of all the products saved in mongoDB
	 * 
	 * @return List<Product>
	 */
	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	/**
	 * createProduct adds a product to the mongoDB
	 * 
	 * @param product (product has id, name, description, price)
	 */
	@Override
	public void createProduct(Product product) {
		productRepository.save(product);
	}

}
