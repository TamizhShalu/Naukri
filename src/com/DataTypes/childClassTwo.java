package com.DataTypes;

public class childClassTwo extends ParentClass {
public static void main(String[] args) {
	childClassTwo cct=new childClassTwo();
	cct.childClassProp();
	cct.parentPropOne();
	cct.parentPropTwo();
	cct.grandChildProp();
}
public void childClassProp() {
	System.out.println("Laptop");
}
}
