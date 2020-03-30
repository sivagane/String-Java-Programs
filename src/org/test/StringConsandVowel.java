package org.test;

public class StringConsandVowel {
public static void main(String[] args) {
	String s="Welcome";
	int Vowel=0,Consonant=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			Vowel++;
		}
			else {
				Consonant++;
			}
		}	
	System.out.println("The Number of Vowel is "+Vowel);
	System.out.println("The Number of Consonat is "+Consonant);
	}
}

