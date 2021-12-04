package com.sonata;

	public class Sedan extends Car{
		private int length;
		public Sedan(int s,double rp,String c,int l){
			 super(s,rp,c);
			 this.length=l;
		 }
		 public double getSalePrice() {
			 if(length>20) {
				 return super.getSalePrice()-(super.getSalePrice()*0.5);
			 }
			 else
			 {
				 return super.getSalePrice()-(super.getSalePrice()*0.1);
			 }
			}
		 }

