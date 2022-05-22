package com.api;

public class webservice3 {

	public static void main(String[] args) {
		
		
	
	    String s= "GADAG";
		
		String d=" ";
		
		/*
		System.out.println(s.charAt(9));
		
		System.out.println(s.length());
		*/
		
		System.out.println(s.length());
		
		for (int i=s.length()-1; i>=0; i--) {
			
		d=d+s.charAt(i);
		
		
		}
		
		System.out.println(d);
		
		
		if (s==d){
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
