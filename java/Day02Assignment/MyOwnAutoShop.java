package com.sonata;

import com.sonata.Car;

 public class MyOwnAutoShop {
	 
	public static void main(String args[]) {
		Sedan sedan=new Sedan(80,100000,"black",50);
	    Ford ford=new Ford(90,200000,"white",2009,10);
	    Car car=new Car(100,300000,"red");
		System.out.println("Sedan"+sedan.getSalePrice());
		System.out.println("Ford"+ford.getSalePrice());
		System.out.println("Car"+car.getSalePrice());
		}
	}
