package org.test;

public class NumberofUpperandLowercase {
public static void main(String[] args) {
	String str="WelComeToJava";
	int upper=0,lower=0,l;
	l=str.length();
	for(int i=0;i<l;i++) {
		char ch=str.charAt(i);
		if(ch>='A'&&ch<='Z') 
			upper++;
		
		else
			if(ch>='a'&&ch<='z') 
				lower++;
			
			else 
				System.out.print("It is not a Alphabet");
			}
	System.out.println("Number of Lowercase is :"+lower);
	System.out.println("Number of Uppercase is :"+upper);
}
}
