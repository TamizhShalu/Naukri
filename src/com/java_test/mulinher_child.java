package com.java_test;

public class mulinher_child implements mult_inheri,multinheri_parentcls1{
public static void main(String[] args) {
	mulinher_child cs=new mulinher_child();
	cs.childclass_native();
	cs.parentclass_native();
	cs.parentcls1_native();
}
public void childclass_native() {
	System.out.println("chennai");
}
@Override
public void parentcls1_native() {
	System.out.println("vellore");
	
}
@Override
public void parentclass_native() {
	System.out.println("coimbatore");
	
}
}
  