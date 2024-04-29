package com.cart.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cart.dto.Bill;
import com.cart.dto.Product;

@Service
public class product_service {
       
	   private ArrayList<Product> cart  = new ArrayList<Product>(); 
	   // add prod
	   public boolean addProduct(Product product) { 
			return cart.add(product);
		}
	   // get all prod
	   public ArrayList<Product> getData(){ 
		   return cart ;
	   }
        // delete prod 
		public boolean deleteProductById(int Pid) { 
			Product product = getProdById(Pid);
			return cart.remove(product);
		}
		
		// for seraching emp based  on id 
		
		public Product getProdById(int id) {
			Product product = null;
			for(Product p : cart) {
				if(p.getPid() == id) {
					product = p;
					break;
				}
			}
			return product;
		}
		
		public boolean  updateProd(int id , int quantity) { 
			Product product =  getProdById(id);
			product.setPquantity(quantity);
			return true ;
		}
         // genrate bill 
	public Bill generateBill() {
			
		    double totalAmount = 0;
		    double taxAmount;
		    double payableAmount;

		    // calculate total amount
		    for (Product product : cart) {
		        totalAmount += (product.getPprice() * product.getPquantity());
		    }

		    // calculate tax  eg. 10% of total amount
		    taxAmount = totalAmount * 0.1;

		    // calculate payable amount
		    payableAmount = totalAmount + taxAmount;

		    // create and return the bill
		    return new Bill(cart, totalAmount, taxAmount, payableAmount);
		}
}