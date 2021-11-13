package com.gcu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.ProductsServiceInterface;
import com.gcu.model.ProductCreateModel;
import com.gcu.model.ProductModel;

/*
 * Project Name: CST-339 Milestone Project
 * Version: 1.2
 * Module name: Product Controller Class
 * Module version: 1.0
 * Authors: Gabriel Cepleanu
 * Synopsis: This class provides the controller for the product pages.
 */

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductsServiceInterface productsService;
	
	@GetMapping("/create")
	public String createProduct(Model model) {
		model.addAttribute("productModel", new ProductCreateModel());
		return "createProduct";
	}
	
	@PostMapping("/doCreate")
	public String doCreate(ProductCreateModel pm, Model model) throws ParseException {
		ProductModel temp = productsService.createProduct(pm.getVacationName(), new SimpleDateFormat("yyyy-MM-dd").parse(pm.getStartingDate()), pm.getDaysOfTrip(),
				pm.getPhotoLink(), pm.getLocation(), pm.getDescription(), pm.getPrice());
		productsService.addProduct(temp);
		model.addAttribute("order", temp);
		return "product";
	}
	

}
