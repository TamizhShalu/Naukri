package com.DataTypes;

public class Looping_Stmt_Task {
public static void main(String[] args) {
	Looping_Stmt_Task ls=new Looping_Stmt_Task();
	ls.whl_Concept();
	ls.do_Whl();
}
public void whl_Concept() {
	int val=1;
	while(val<=20) {
		System.out.println(val=val+1);
		val++;
	}
	
}
public void do_Whl() {
	int a=1;
	do {
		System.out.println(a);
		a++;
	}while(a<=1000);
			
}
}
