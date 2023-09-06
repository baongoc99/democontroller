package edu.pxu.spring.democontroller.repository;

import java.util.List;

import edu.pxu.spring.democontroller.model.Product;

public interface ProductReponsitory {
	 List <Product> findAll();
	 
	 Product findById(int id);
	 
	 void save(Product product);
	
}
