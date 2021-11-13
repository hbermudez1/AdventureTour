package com.gcu.model;

import java.util.Date;

/*
 * Project Name: CST-339 Milestone Project
 * Version: 1.2
 * Module name: Product Creation Model Class
 * Module version: 1.0
 * Authors: Gabriel Cepleanu
 * Synopsis: This class provides a model for creating a product.
 * This is a temporary class that will be removed in a future version.
 */

public class ProductCreateModel {
	private String vacationName;
	private String startingDate;
	private int daysOfTrip;
	private String photoLink;
	private String location;
	private String description;
	private double price;

	public String getVacationName() {
		return vacationName;
	}

	public void setVacationName(String vacationName) {
		this.vacationName = vacationName;
	}

	public String getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(String startingDate) {
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

}
