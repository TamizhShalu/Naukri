package com.DataTypes;

public class Strng_Types {
public static void main(String[] args) {
	immutable_Literal();
	//mutable_nonLiteral();
}
public static void immutable_Literal() {
	String s="Tamizh";
	String s1="Tamizh";
	String s2="Srini";
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	s=s1+s2;
	System.out.println(System.identityHashCode(s));
	
}
public static void mutable_nonLiteral() {
	StringBuffer sb=new StringBuffer("vinu");
	StringBuffer sb1=new StringBuffer("shalu");
	System.out.println(System.identityHashCode(sb1));
	System.out.println(System.identityHashCode(sb));
	sb=sb.append(sb1);
	System.out.println(sb);
}
}