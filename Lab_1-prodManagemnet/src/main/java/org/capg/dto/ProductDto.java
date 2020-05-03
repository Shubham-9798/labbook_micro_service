package org.capg.dto;

public class ProductDto {
	private String productName;
	private String productType;
	private long productStock;
	private long productPrice;
	
	public ProductDto (String productName, String productType, long productStock, long productPrice) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.productStock = productStock;
		this.productPrice = productPrice;
	}
	

	public ProductDto() {
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
