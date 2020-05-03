package org.capg.service;

import java.util.List;

import org.capg.dao.IProductDao;
import org.capg.dto.ProductDto;
import org.capg.entity.Product;
import org.capg.entity.ProductInCart;
import org.springframework.beans.factory.annotation.Autowired;

public interface IProductManagService {
	
	String test();
	Product add(Product product);
	List<Product> fetchAllProduct();
	Product fetchProductById(long id);
	List<Product> fetchProductByType(String id);
	ProductInCart addToCart(ProductInCart product);
	
}
