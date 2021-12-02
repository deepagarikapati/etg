package com.sonata;

public class LargeNumber {
	public static void main(String args[]) {
		int a[]= {10,30,45,89,95,2};
		for(int i=0;i<=5;i++) {
			for(int j=i+1;j<=5;j++)
			{
				if(a[i]>a[j])
				{
					System.out.println("largest=a[i]");
				}
				else
				{
					System.out.println();
			}
			}
		}
	}
}

