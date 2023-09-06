package edu.pxu.spring.democontroller.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.pxu.spring.democontroller.model.Product;

public class ProductReponsitoryImpl implements ProductReponsitory {
	
	private static final Map<Integer, Product> products;
	
	static {
		products = new HashMap<>();
		products.put(1, new Product(1, "GTFS", "Fender Stratecas", 0));
		products.put(2, new Product(2, "GTFT", "Fender Telecaster", 0));
		products.put(3, new Product(3, "GTLP", "Gibson Les Paul", 0));
		products.put(4, new Product(4, "GTGS", "Gibson GS", 1410));
		products.put(5, new Product(5, "GTPV", "Gibson Flying V", 0));
		products.put(6, new Product(6, "GTSS", "Superstrat", 4200));
		
	}
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return new ArrayList<>(products.values());
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		Product product = products.get(id);
		return product;
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		products.put(product.getId(),product);
		
	}

}
