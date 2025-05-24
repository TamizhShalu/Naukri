package com.DataTypes;

public class VariableConcept {
int val=2; //class variable
	
	static name="Tamizh";
	
	
	
	
	public static void main(String[] args) {
		VariableConcept vc=new VariableConcept();
		vc.methodone();
		methodtwo();
	}
	
	public void methodone() {
		int i=5;// local variable
		System.out.println(i);
	}
	
	public static void methodtwo() {
		int j=6;// local variable
		System.out.println(j);
	}
	
}








