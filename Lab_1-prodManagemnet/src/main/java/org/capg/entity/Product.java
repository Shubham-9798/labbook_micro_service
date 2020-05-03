package org.capg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product_tbl")
public class Product {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(nullable = false)
	private String productName;
    
    @Column(nullable = false)
	private String productType;
    
    @Column(nullable = false)
	private long productStock;
    
    @Column(nullable = false)
	private long productPrice;
	
	public Product(String productName, String productType, long productStock, long productPrice) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.productStock = productStock;
		this.productPrice = productPrice;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public long getProductStock() {
		return productStock;
	}

	public void setProductStock(long productStock) {
		this.productStock = productStock;
	}

	public long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productType=" + productType + ", productStock=" + productStock
				+ ", productPrice=" + productPrice + "]";
	}
	
	
	
}
