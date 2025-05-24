package com.exp;

public class Excp_Handling {
public static void main(String[] args) {
	Exp_Concept();
}
public static void Exp_Concept() {
	
	try {
		int a=10;
		int b=2;
		System.out.println(a/b);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		System.out.println("hello");
	}
}
}
