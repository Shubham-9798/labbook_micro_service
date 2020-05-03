package org.capg.dao;

import java.util.List;

import org.capg.dto.ProductDto;
import org.capg.entity.Product;

public interface IProductDao {
	String test();
	
	Product add(Product product);
	List<Product> fetchAllProduct();
	Product fetchProductById(long id);
	List<Product> fetchProductByType(String type);
}
