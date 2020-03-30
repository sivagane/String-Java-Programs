package org.test;

import java.util.Scanner;

public class PhonenumberLength {
public static void main(String[] args) {
	String s1;
	Scanner s= new Scanner (System.in);
	System.out.println("Enter the Phone Number");
	s1=s.nextLine();
	if(s1.contains("9750364952")) {
		System.out.println("Valid");
	}
	else {
		System.out.println("Invalid");
	}
}
}
