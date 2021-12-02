package com.sonata;

public class TestSpecificValueArray {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5};
		int svalue=3;
		boolean found=false;
		for(int i=0;i<=4;i++)
		{
			if(a[i]==svalue)
			{
				found=true;
				break;
				
			}
		}
		if(found)
		{
			System.out.println("the specific value "+"is found");
		}
		else
		{
			System.out.println("the specific value"+svalue+"is not found");
		}
	}

}
