package org.test;


public class ConvertOpposite {
static void Opposite(StringBuffer str) {
int ln=str.length();
for(int  i=0;i<ln;i++) {
	Character c=str.charAt(i);
	if(Character.isLowerCase(c)) {
		str.replace(i, i+1, Character.toUpperCase(c)+" ");
	}
	else {
		str.replace(i,i+1, Character.toLowerCase(c)+" ");
	}

}
}
   public static void main (String[] args) {
	   StringBuffer str= new StringBuffer("WelcomE");
			    Opposite(str);
	   System.out.println(str);

   }
}

