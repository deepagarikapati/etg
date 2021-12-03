package com.sonata;

public class HighestCountDuplicates {
	public static void main(String args[]) {
		int count=0;
		int a[]= {1,2,3,5,2,6,9,4,3,5};
		System.out.println("original array elements:");
		for(int i=0;i<=9;i++)
		{
			System.out.println(a[i]+"");
		}
		System.out.println("\n");
		System.out.println("duplicates present in array elementd are: ");
		for(int i=0;i<=9;i++)
		{
			for(int j=i+1;j<=9;j++) {
				if(a[i]==a[j])
					
					System.out.println(a[j]+"");
				count++;
			}
		}
		
	}

}
