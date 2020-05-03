DROP TABLE IF EXISTS billionaires;
 
CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  productName VARCHAR(250) NOT NULL,
  productType VARCHAR(250) NOT NULL,
  productStock INT,
  productPrice 
);
 
INSERT INTO billionaires (first_name, last_name, career) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist'),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');

--------------------------------------------------------
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

		    /*
	        String jql = "from Product p where p.productType=:type";
	        
	        TypedQuery<Product> query = entityManager.createQuery(jql, Product.class);
	        query.setParameter("type", type);
	        
	        System.out.println(query);
	        List<Product> list = query.getResultList();
	        return list;
	        */