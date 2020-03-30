package org.test;

import java.util.Scanner;

public class StringPresentorNot {
public static void main(String[] args) {
	String s1,s2,s3,s4;
	Scanner s=new Scanner (System.in);
	System.out.println("Enter the Email id");
	s1=s.nextLine();
	if(s1.contains("@"))
	{
	System.out.println("Valid email id");
	}
	else {
	System.out.println("Invalid email id");
	}
	System.out.println("Enter the Address");
	s2=s.nextLine();
	if(s2.contains("605001")) {
		System.out.println("Valid Address");
	}
	else {
	System.out.println("Invlaid Address");
	}
	System.out.println("Enter the Email id");
	s3=s.nextLine();
	if(s3.contains("@")) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	System.out.println("Enter the Phone Number");
	s4=s.nextLine();
	if(s4.contains("9750364952")){
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	s.close();
}}
