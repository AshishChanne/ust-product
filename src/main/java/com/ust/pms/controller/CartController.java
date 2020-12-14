package com.ust.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ust.pms.model.Cart;
import com.ust.pms.model.Product;
import com.ust.pms.service.CartService;

@Controller
@RequestMapping("cart")
public class CartController {

	/*@Autowired
	private CartService cs;
	
	@PostMapping()
	public ResponseEntity<String> createCart(@RequestBody Cart cart) {
		
		
		cs.createCart(cart);
		return new ResponseEntity<String>("Record saved successfully",HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Cart> getCart(@PathVariable("id") int id) {
		
		Cart products= cs.getProductsInCart(id);
		
		return new ResponseEntity<Cart>(products,HttpStatus.OK);
	}  */

}
