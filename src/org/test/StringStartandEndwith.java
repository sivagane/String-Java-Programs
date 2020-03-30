package org.test;

public class StringStartandEndwith {
public static void main(String[] args) {
	String str="Welcome To Java Class";
	String a="Hai i am Siva";
	System.out.println("The String str Starts with Welcome "+str.startsWith("Welcome"));
	System.out.println("The String a Starts with Welcome "+a.startsWith("Welcome"));
	System.out.println("The String str ends with "+str.endsWith("Class"));
	System.out.println("The String str ends with "+str.endsWith("Java"));
	System.out.println("The String str is Empty "+str.isEmpty());
}
}
