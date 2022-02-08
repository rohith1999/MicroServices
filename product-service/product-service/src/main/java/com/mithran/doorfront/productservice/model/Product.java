package com.mithran.doorfront.productservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Product is a model class that consists of id, name, description and price
 * @author Rohith S
 *
 */
@Document(value="product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {

/**
 * Id is the primary key for the Product Collection
 */
@Id	
String id;
/**
 * Product name
 */
String name;
/**
 * Product description
 */
String description;
/**
 * Product price
 */
String price;

}
