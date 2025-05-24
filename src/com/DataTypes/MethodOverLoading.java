package com.DataTypes;

public class MethodOverLoading {
public static void main(String[] args) {
	MethodOverLoading mo=new MethodOverLoading();
	mo.details(4775);
	mo.details(79,65);
	mo.details(75,69,5);
}

public void details(int stuId) {
	System.out.println(stuId);
	
}
public void details(int sciMark,int mathMark ) {
	System.out.println(sciMark);
	System.out.println(mathMark);
}
public void details(int socMark,int engMark ,int rank) {
	System.out.println(socMark);
	System.out.println(engMark);
	System.out.println(rank);
}
}
