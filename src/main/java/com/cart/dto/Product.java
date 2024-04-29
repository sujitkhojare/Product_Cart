package com.cart.dto;

public class Product {
		 private int pid ;
		 private String pname ;
		 private int pprice;
		 private int pquantity ;
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public int getPprice() {
			return pprice;
		}
		public void setPprice(int pprice) {
			this.pprice = pprice;
		}
		public int getPquantity() {
			return pquantity;
		}
		public void setPquantity(int pquantity) {
			this.pquantity = pquantity;
		}
		 
//	 { 
//		  "Pid":101,
//	  "Pname":"Pendrive",
//		  "Pprice":520,
//		  "Pquantity":2 
//		 }
		 
		 
//		 {
//			    "Pid": 123,
//			    "Pname": "Mobile",
//			    "Pprice": 15000,
//			    "Pquantity": 2
//			}
//
//		 
		
}
