package org.capg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductCart_tbl")
public class ProductCart {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(nullable = false)
	private long productId;
    
    
	public ProductCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductCart(long id, long productId) {
		super();
		this.id = id;
		this.productId = productId;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}



	@Override
	public String toString() {
		return "ProductCart [id=" + id + ", productId=" + productId + "]";
	}
}
