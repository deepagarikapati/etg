package com.sonata;


	public class Ford extends Car{
	    private int year;
	    public int manufacturerDiscount;
	     public Ford(int s,double rp,String c,int y,int md) {
	    	 super(s,rp,c);
	    	 this.year=y;
	    	 this.manufacturerDiscount=md;
	     }
	     public double getSalePrice() {
	    	 return super.getSalePrice()-manufacturerDiscount;
	     }
	  }


