package org.capg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductCart_tbl")
public class ProductInCart {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(nullable = false)
	private long productId;
    @Column(nullable = false)
	private long quantity;
    @Column(nullable = false)
	private String type;
    
    
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public ProductInCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProductInCart(long productId, long quantity, String type) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getId() {
		return id;
	}
//	public void setId(long id) {
//		this.id = id;
//	}
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
