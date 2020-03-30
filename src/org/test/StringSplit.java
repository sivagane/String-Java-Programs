package org.test;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class StringSplit {
public static void main(String[] args) {
	String s="Welcome to Java Class";
	String s1[]=s.split(" ");
	for(int i=0;i<s1.length;i++) {
		System.out.println(s1[i]);
	}
	String s2[]=s.split("l");
	for(int i=0;i<s2.length;i++) {
		System.out.println(s2[i]);
	}
}
}
