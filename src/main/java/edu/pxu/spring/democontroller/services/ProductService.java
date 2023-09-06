package edu.pxu.spring.democontroller.services;

import java.util.List;

import edu.pxu.spring.democontroller.model.Product;

public interface ProductService {
	List<Product> findAll();
	Product findByid(int id);
	void save(Product product);
}
