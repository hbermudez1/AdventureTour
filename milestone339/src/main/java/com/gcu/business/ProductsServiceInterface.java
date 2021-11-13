package com.gcu.business;

import java.util.Date;
import java.util.List;

import com.gcu.model.ProductModel;

public interface ProductsServiceInterface {
	public List<ProductModel> getProducts();
	public ProductModel getProductById(int id);
	public boolean addProduct(ProductModel newProduct);
	public ProductModel createProduct(String vacationName, Date startingDate, int daysOfTrip, String photoLink,
			String location, String description, double price);
	public void init();
	public void destroy();
}
