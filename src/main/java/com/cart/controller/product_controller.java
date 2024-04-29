package com.cart.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cart.dto.Bill;
import com.cart.dto.Product;
import com.cart.service.product_service;

@RestController
public class product_controller {

	 @Autowired 
	 product_service  productservice ; 
	 
	 @PostMapping("/insertData")
		public String insertData(@RequestBody Product product) { 
		 System.out.println("IN Controller");
			boolean result = productservice.addProduct(product);
			
			if(result) { 
				return "Product save sucessfully"; 
				
			} 
			else { 
				return "unable save Product";
			}
		}
	 
		 @GetMapping("/retriveData")
		 public ArrayList<Product> retriveData() { 
			 return  productservice.getData();
		 }
		 
		 @DeleteMapping("/deleteProductById")
		    public String deleteProductById(@RequestParam("Pid") int Pid) { 
		        boolean result = productservice.deleteProductById(Pid);
				
		        if (result) { 
		            return "Product deleted successfully"; 
		        } else { 
		            return "Unable to delete Prodcut ";
		        }
		    }
			
	 //http://localhost:8080/getProdById/13
		 
		@GetMapping("/getProdById/{id}")
		public Product getProdById(@PathVariable(value = "id") int Pid) {
			return productservice.getProdById(Pid);
		}
		
		@PutMapping("/updateProductDetails/{Pid}/{Pquantity}")
		public String updateProductDetails(@PathVariable("Pid") int Pid, @PathVariable("Pquantity") int quantity)
		{
		    boolean result = productservice.updateProd(Pid, quantity);
		    if (result) {
		        return "Product Updated Successfully.";
		    } else {
		        return "Product with ID " + Pid + " not found.";
		    }
		}
		
		// genrate bill 
		    @PostMapping("/generateBill")
		    public Bill generateBill(@RequestBody ArrayList<Product> products) {
		        return productservice.generateBill(); 
		    }
		}
