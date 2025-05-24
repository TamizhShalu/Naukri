package com.typ_cstng;

public class Typ_Casting {
public static void main(String[] args) {
	
}
public static void widening_narrowing() {
	byte b=100;
	short s=b;
	System.out.println(s);//widening
	int val=30;
	short sval=(short) val;
	System.out.println(sval);//narrowing
}
}
