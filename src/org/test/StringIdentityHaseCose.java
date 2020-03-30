package org.test;

public class StringIdentityHaseCose {
public static void main(String[] args) {
	System.out.println("Literal Strings");
	String a="Siva";
	System.out.println(a);
	String b="Siva";
	System.out.println(b);
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	String c="Siva";
	System.out.println(c);
	String d="Ganesh";
	System.out.println(d);
	String e="Sivaganesh";
	System.out.println(e);
	System.out.println(System.identityHashCode(c));
	System.out.println(System.identityHashCode(d));
	System.out.println(System.identityHashCode(e));
	
	System.out.println("Non Literal Strings");
	String a1=new String("Siva");
	System.out.println(a);
	String b1=new String ("Siva");
	System.out.println(b);
	System.out.println(System.identityHashCode(a1));
	System.out.println(System.identityHashCode(b1));
	String c1=new String("Siva");
	System.out.println(c);
	String d1=new String("Ganesh");
	System.out.println(d);
	String e1=new String("Sivaganesh");
	System.out.println(e);
	System.out.println(System.identityHashCode(c1));
	System.out.println(System.identityHashCode(d1));
	System.out.println(System.identityHashCode(e1));
	
	
}
}
