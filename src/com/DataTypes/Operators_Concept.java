package com.DataTypes;

public class Operators_Concept {
public static void main(String[] args) {
Operators_Concept oc=new Operators_Concept();
oc.arith();
oc.relational();
oc.logical();
}
public void arith() {
	int a=10;
	int b=3;
	int c=a+b;
	System.out.println(c);
	int d=a-b;
	System.out.println(d);
	int e=a%b;
	System.out.println(e);
	int f=a*b;
	System.out.println(f);
}
public void relational() {
int num1=200;
int num2=150;
boolean b=num1>num2;
System.out.println(b);
boolean c=num1<num2;
System.out.println(c);
boolean d=num1>=num2;
System.out.println(d);
boolean e=num1<=num2;
System.out.println(e);
boolean f=num1!=num2;
System.out.println(f);
boolean g=num1==num2;
System.out.println(g);

}
public void logical() {
	int val1=50;
	int val2=30;
	boolean val3=((val1>20)&&(val2<=30));
	System.out.println(val3);
	boolean val4=((val1==50)||(val2==50));
	System.out.println(val4);
	
}
}