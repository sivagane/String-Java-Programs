package org.test;

import java.util.Scanner;

public class StringReplace {
public static void main(String[] args) {
	String s= "Welcome to class java",c;
	String a="Greens Adayar";
	String b="sivag918@gmail.com";
	System.out.println("The replaced String is "+s.replace("java", "sql"));
	System.out.println("The replaced String is "+a.replace("Adayar", "Omr"));
	System.out.println("The replaced String is "+s.replace(" ", "#"));
	Scanner s1=new Scanner (System.in);
	System.out.println("Enter the Email id :");
	b=s1.nextLine();
if(b.contains("gmail")) {
	System.out.println("True");
	System.out.println(b.replace("gmail","yahoo"));
}
else {
	System.out.println("False");
}
System.out.println("Enter the Address :");
c=s1.nextLine();
if(c.contains("605001")) {
	System.out.println("True");
	System.out.println(c.replace("605001", " "));
}
else {
	System.out.println("False");
}
s1.close();
}
}
