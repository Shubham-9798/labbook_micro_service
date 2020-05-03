package org.capg.service;

import java.util.List;

import org.capg.dao.IProductDao;
import org.capg.entity.Product;
import org.capg.entity.ProductInCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductManagServiceImpl implements IProductManagService {
    private IProductDao productDao;
    
    @Autowired
	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

	public String test() {
		return productDao.test();
	}
	
	public Product add(Product product) {
		return productDao.add(product);
	}
	
	public List<Product> fetchAllProduct() {
		return productDao.fetchAllProduct();
	}
	
	public Product fetchProductById(long id) {
		return productDao.fetchProductById(id);
	}
	
	public List<Product> fetchProductByType(String type) {
		return productDao.fetchProductByType(type);
	}
	
	public ProductInCart addToCart(ProductInCart product) {
		return productDao.addToCart(product);
	}
	
	
}
