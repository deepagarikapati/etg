package com.sonata;

public class StudentDetails {
	int stdId;
	String stdName;
	int stdClass;
	StudentDetails(int a,String b,int c){
		this.stdId=a;
		this.stdName=b;
		this.stdClass=c;
	}
	public void display() {
		System.out.println(stdId);
		System.out.println(stdName);
		System.out.println(stdClass);	
	}
	public static void main(String args[]) {
		StudentDetails s=new StudentDetails(12,"abcgd",9);
		s.display();
		StudentDetails s1=new StudentDetails(13,"xytbk",8);
		s1.display();
	}
}
