package com.DataTypes;

public class Strng_concpt {
public static void main(String[] args) {
	reverse_concept();
}
public static void reverse_concept() {
	String s="Tamizharasi";
	int length=s.length();
	System.out.println(s.length());
	
	for(int i=s.length()-1;i>=0;i--) {
		System.out.println(s.charAt(i));
}
}
}
