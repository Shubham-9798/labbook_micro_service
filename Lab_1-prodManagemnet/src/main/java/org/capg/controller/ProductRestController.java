package org.capg.controller;

import java.util.List;

import javax.validation.Valid;

import org.capg.dto.ProductDto;
import org.capg.dto.ProductInCartDto;
import org.capg.entity.Product;
import org.capg.entity.ProductInCart;
import org.capg.service.IProductManagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
//@ComponentScan(basePackages = {"org.capg.service"})
public class ProductRestController {
	   
	   IProductManagService service;
	   @Autowired
	   public void setService(IProductManagService service) {
			this.service = service;
		}
	   
	   
	   @GetMapping("/test")
	   public ResponseEntity<String> findEmployee(){
	      return new ResponseEntity<String>(service.test(), HttpStatus.OK);
	   }
	   
	   @PostMapping("/add")
	   public ResponseEntity<Product> add(@RequestBody @Valid ProductDto product) {
		   Product newProduct = new Product(product.getProductName(), product.getProductType(), product.getProductStock(), product.getProductPrice());
		   
		   return new ResponseEntity<Product>(service.add(newProduct), HttpStatus.OK);
	   }
	   
	   
	  @GetMapping("/list")
	  public ResponseEntity<List<Product>> fecthAllProduct() {
		  
		  return new ResponseEntity<List<Product>>(service.fetchAllProduct(), HttpStatus.OK);
	  }
	  
	  @GetMapping("/list/{id}")
	  public ResponseEntity<Product> fecthProductById(@PathVariable("id") long id) {
		  
		  return new ResponseEntity<Product>(service.fetchProductById(id), HttpStatus.OK);
	  }
	  
	  @GetMapping("/listType/{type}")
	  public ResponseEntity<List<Product>> fecthProductById(@PathVariable("type") String type) {
		  
		  return new ResponseEntity<List<Product>>(service.fetchProductByType(type), HttpStatus.OK);
	  }
	  
	   @PostMapping("/addtocart")
	  public ResponseEntity<ProductInCart> addToCard(@RequestBody @Valid ProductInCartDto product) {
		  /*
		   * product: { type, productId, quantity}
		   */
		  ProductInCart productCart = covertToProductInCart(product);
		  return  new ResponseEntity<ProductInCart>(service.addToCart(productCart), HttpStatus.OK);
	  }
	  
	  
	  public ProductInCart covertToProductInCart(ProductInCartDto product) {
		  return new ProductInCart(product.getProductId(),1, product.getType());
	  }
	  
	  



}
