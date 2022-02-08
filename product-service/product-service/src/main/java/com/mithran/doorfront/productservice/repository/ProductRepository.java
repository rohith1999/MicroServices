package com.mithran.doorfront.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mithran.doorfront.productservice.model.Product;

/**
 * ProductRepository is an interface that communicates with the mongoDB to
 * perform CRUD operations using MongoRepository
 * 
 * @author Rohith S
 *
 */
public interface ProductRepository extends MongoRepository<Product, String> {

}
