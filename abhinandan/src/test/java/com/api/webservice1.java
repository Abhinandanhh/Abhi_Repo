package com.api;

public class webservice1 {

public static void main (String[] args) {
	
	int a=3;
	int b=2;
	
	System.out.println("Sum of the numbers is: " + (a + b));
	

	
	webservice2 w2=new webservice2();
	
	System.out.println(w2.validateheader());
	
	String str= "I have $88 with me";
	
	System.out.println(str.charAt(7));
	
	System.out.println(str.indexOf("$"));
	
}
}