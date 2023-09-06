package edu.pxu.spring.democontroller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.pxu.spring.democontroller.model.Product;

public class ProductServiceImpl implements ProductService{
	@Autowired
	public ProductService productService;
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return this.productService.findAll();
	}

	@Override
	public Product findByid(int id) {
		// TODO Auto-generated method stub
		return this.productService.findByid(id);
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		this.productService.save(product);
	}

}
