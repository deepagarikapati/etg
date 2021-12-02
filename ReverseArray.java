package com.sonata;

public class ReverseArray {
	public static void main(String args){
		int a[]= {1,2,3,4,5};
		System.out.println("original array");
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]+"");
		}
		System.out.println();
		System.out.println("Array in reverse order:");
		for(int i=3;i>=0;i--) {
			System.out.println(a[i]+"");
		}
		
	}

}
