package com.gcu.model;

import java.util.Date;

/*
 * Project Name: CST-339 Milestone Project
 * Version: 1.2
 * Module name: Product Model Class
 * Module version: 1.0
 * Authors: Gabriel Cepleanu
 * Synopsis: This class provides a model for a product.
 */

public class ProductModel {
	private int id;
	private String vacationName;
	private Date startingDate;
	private int daysOfTrip;
	private String photoLink;
	private String location;
	private String description;
	private double price;
	
	public ProductModel() {
		
	}

	public ProductModel(int id, String vacationName, Date startingDate, int daysOfTrip, String photoLink,
			String location, String description, double price) {
		super();
		this.id = id;
		this.vacationName = vacationName;
		this.startingDate = startingDate;
		this.daysOfTrip = daysOfTrip;
		this.photoLink = photoLink;
		this.location = location;
		this.description = description;
		this.price = price;
	}

	public String getVacationName() {
		return vacationName;
	}

	public void setVacationName(String vacationName) {
		this.vacationName = vacationName;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public int getDaysOfTrip() {
		return daysOfTrip;
	}

	public void setDaysOfTrip(int daysOfTrip) {
		this.daysOfTrip = daysOfTrip;
	}

	public String getPhotoLink() {
		return photoLink;
	}

	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", vacationName=" + vacationName + ", startingDate=" + startingDate
				+ ", daysOfTrip=" + daysOfTrip + ", photoLink=" + photoLink + ", location=" + location
				+ ", description=" + description + ", price=" + price + "]";
	}


	
	
}
