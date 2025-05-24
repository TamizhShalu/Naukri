package com.java_test;

public class mthd_overldng {
public static void main(String[] args) {
	marks(67);
	marks(89,88);
    marks(236,3.0f,"A");
 	
}
public static void marks(int science) {
	System.out.println(science);
	
}
public static void marks(int maths,int social) {
	System.out.println(maths);
	System.out.println(social);
}
public static void marks(int total,float rank,String grade) {
	System.out.println(total);
	System.out.println(rank);
	System.out.println(grade);
}
}
