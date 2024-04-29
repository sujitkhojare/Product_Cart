package com.cart.dto;

import java.util.ArrayList;

public class Bill {

	    private ArrayList<Product> products;
	    private double totalamount;
	    private double taxamount;
	    private double payableamount;

	    // constructor
	    public Bill(ArrayList<Product> products, double totalamount, double taxamount, double payableamount) {
	        this.products = products;
	        this.totalamount = totalamount;
	        this.taxamount = taxamount;
	        this.payableamount = payableamount;
	    }
	    
	    
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}
	public double getTaxamount() {
		return taxamount;
	}
	public void setTaxamount(double taxamount) {
		this.taxamount = taxamount;
	}
	public double getPayableamount() {
		return payableamount;
	}
	public void setPayableamount(double payableamount) {
		this.payableamount = payableamount;
	} 
}
