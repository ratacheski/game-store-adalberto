package com.adalberto.gamestore.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adalberto.gamestore.domain.model.Product;
import com.adalberto.gamestore.domain.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController{
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> list(){
		return productService.list();
	}

}
