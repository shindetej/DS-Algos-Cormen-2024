package com.flextrade.practice;

import java.util.Arrays;

public class StringAPIs {
	
	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "RakshaBandhan";
		String s3 = "Ram";
		
		if(s1.equals(s2)) {
			System.out.println("S1 and S2 equal");
		}
		else {
			System.out.println("S2 and S2 not equal");
		}
		
		System.out.println(s1.equals(s3)?"equal s1 and s3":"not equals s1 and s3");
		
		System.out.println("length() "+ s1.length());
		
		System.out.println("charAt 9 : "+s2.charAt(9));
		
		int i = 10;
		System.out.println("value of int i :"+String.valueOf(i));
		System.out.println("substring of s2 from 2  :"+s2.substring(4));
		System.out.println("char at 5 and char at 9 included in substring below: "+s2.charAt(5) + " , "+s2.charAt(8));
		System.out.println("substring of s2 from 5 to 8 "+s2.substring(5,9));
		
		String replaced = s2.replace("Code", "Book");
		System.out.println("Replaced code with Java");
		
		StringBuilder sb =  new StringBuilder(s1);
		sb.append("Shyam");
		System.out.println("new SB entry  :  "+sb.toString());
		System.out.println("indexOf s in Rakshabandhan"+s2.indexOf('s'));
		
		char[] chs2 =  s2.toCharArray();
		System.out.println("toCharArray "+ Arrays.toString(chs2));
		
		
	}
	
	
	
}
