package com.sonata;

 public class Car {
	 private int speed;
	 private double regularPrice;
	private String color;
	public Car(int s,double rp,String c) {
		this.speed=s;
		this.regularPrice=rp;
		this.color=c;
		}
	public double getSalePrice() {
		return regularPrice;
	}
}
