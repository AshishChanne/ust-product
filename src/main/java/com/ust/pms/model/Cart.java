package com.ust.pms.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@Entity
public class Cart implements Serializable{

/*	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	@OneToMany(mappedBy="productId",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JsonIgnore
	private List<Product> product;
	
	public Cart(){}

	public Cart(List<Product> product) {
		super();
		
		this.product = product;
	}

     public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}  
	
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

*/
	
	
	
}
