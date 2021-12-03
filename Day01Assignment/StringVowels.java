package com.sonata;

public class StringVowels {

	public static void main(String args[]) {
		String s="this is a javaa program";
		String str=s;
		for(int i=0;i<=str.length();i++)
		{
			char c=str.charAt(i);
			if((c=='A')||(c=='a')||(c=='E')||(c=='I')||(c=='i')||(c=='o')||(c=='o')||(c=='U')||(c=='u'))
			{
				String front=str.substring(0,i);
				String back=str.substring(i+1);
				str=front+"$"+back;
			}
		}
		System.out.println("before Coversion String:"+s);
		System.out.println();
		System.out.println("after conversion string:"+str);
		
	}

}