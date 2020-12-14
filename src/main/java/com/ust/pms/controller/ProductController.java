package com.ust.pms.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pms.model.Product;
import com.ust.pms.repository.ProductRepository;
import java.util.ArrayList;
@RequestMapping("product")
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ProductController {
	
	@Autowired
	private ProductRepository repo;
	/*private List<Product> products = new ArrayList<>(
			Arrays.asList(new Product(7222, "Mouse", 233, 900), new Product(3343, "Bags", 8900, 80),
					new Product(4334, "Shoes", 5600, 1200), new Product(4834, "Socks", 600, 200)));*/
	
	
	@GetMapping("/{pid}")
	public ResponseEntity<Optional<Product>> getProduct(@PathVariable("pid") int pid) {
		// Product product=new Product(100,"Laptop",5,5000);
		Optional<Product> product=repo.findById(pid);
		 if(repo.existsById(pid))
			{
				return new ResponseEntity<Optional<Product>>(product,HttpStatus.OK);
			}else {
				return new ResponseEntity<Optional<Product>>(product, HttpStatus.NO_CONTENT);
			}
		 
		
	}
	
	@GetMapping()
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> products = new ArrayList<Product>();
		products=(List<Product>) repo.findAll();
		
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}
	
	@DeleteMapping("{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable("pid") Integer pid) {
		
		 if(repo.existsById(pid))
			{
			 repo.deleteById(pid);
			 return new ResponseEntity<String>("successfully deleted",HttpStatus.OK);
			}else {
				return new ResponseEntity<String>("Not deleted",HttpStatus.NOT_FOUND);
			}	
	}
	
	@PutMapping()
	public ResponseEntity<String> updateProduct(@RequestBody Product product) {
		System.out.println(product);
		if(repo.existsById(product.getProductId()))
		{
			repo.save(product);
		return new ResponseEntity<String>("Record updated successfully",HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Record not updated",HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping()
	public ResponseEntity<String> createProduct(@RequestBody Product product) {
		System.out.println(product);
		
		repo.save(product);
		return new ResponseEntity<String>("Record saved successfully",HttpStatus.CREATED);
		
		
	}

}
