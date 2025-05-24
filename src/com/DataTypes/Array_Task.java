package com.DataTypes;

public class Array_Task {
public static void main(String[] args) {
	ltr_arr();
	//non_Ltr();
}
public static void ltr_arr() {
	int[] ltr= {10,20,30,20};
	
	
	for(int i=0;i<ltr.length;i++) {
		System.out.println(ltr[i]);
	}
}

public static void non_Ltr() {
	int[] nonltr=new int[7];
	nonltr[0]=20;
	nonltr[1]=30;
	nonltr[2]=40;
	nonltr[3]=30;
	nonltr[3]=50;
	nonltr[5]=60;
	nonltr[6]=80;
	
	for(int i=0;i<nonltr.length;i++) {
		System.out.println(nonltr[i]);
	}
}
}

