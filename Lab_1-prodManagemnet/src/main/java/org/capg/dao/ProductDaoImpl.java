package org.capg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.capg.entity.Product;
import org.capg.entity.ProductInCart;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements IProductDao {
	
    private EntityManager entityManager;

    @PersistenceContext 
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
	
	public String test() {
		return "working";
	}
	
	public Product add(Product product) {
		product = entityManager.merge(product);
        return product;
	}
	
	public List<Product> fetchAllProduct() {
        String jql = "from Product";
        TypedQuery<Product> query = entityManager.createQuery(jql, Product.class);
        
        List<Product> list = query.getResultList();
        return list;
	}
	
	public Product fetchProductById(long id) {
		return entityManager.find(Product.class, id);
	}
	
	public List<Product> fetchProductByType(String type) {

		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Product> criteria = builder.createQuery(Product.class);
		Root<Product> root = criteria.from(Product.class);
		 
		criteria.where(
		    builder.equal(root.get("productType"), "shop")
		);
		 
		List<Product> products = entityManager
		.createQuery(criteria)
		.getResultList();
		
		return products;
	}
	
	public ProductInCart addToCart(ProductInCart product) {
//		long productId = product.getProductId();
//		long quantity = product.getQuantity();
		
		return entityManager.merge(product);

	}
	
	
}
