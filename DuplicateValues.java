package com.sonata;

public class DuplicateValues {
	public static void main(String args[]) {
		int a[]= {1,2,3,5,2,6,9,4,3,5};
		for(int i=0;i<=9;i++)
		{
			for(int j=i+1;j<=9;j++) {
				if(a[i]==a[j])
					System.out.println(a[j]);
			}
		}
		
	}

}
