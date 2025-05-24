package com.DataTypes;

public class ChildClass extends ParentClass {
public static void main(String[] args) {
	ChildClass cc=new ChildClass();
	cc.childPropOne();
	cc.childPropTwo();
	cc.parentPropOne();
	cc.parentPropTwo();
	cc.grandChildProp();
}
public void childPropOne() {
	System.out.println("Degree");
}
public void childPropTwo() {
	System.out.println("Scooty");
}
}
