package com.sonata;
public class Tshirt {
	String color;
	String material;
	String design;
	String size;
	public Tshirt(String c,String m,String d,String s) {
		this.color=c;
		this.material=m;
		this.design=d;
		this.size=s;}
	public void small() {
		System.out.println("This is small size");
		}
	public void large() {
		System.out.println("This is large size");
		}
	public void xtraLarge() {
		System.out.println("This is xtralarge size");
	}
	public void display() {
		    System.out.println(color);
			System.out.println(material);
			System.out.println(design);
			System.out.println(size);
	}
	public static void main(String args[]) {
		Tshirt t1=new Tshirt("blue","cotton","checks","small");
		t1.display();
		Tshirt t2=new Tshirt("purple","cotton","plane","large");
		t2.display();
		Tshirt t3=new Tshirt("white","cotton","multicolor","xtralarge");
		t3.display();
		}
	}
