package com.DataTypes;

public class Array_Types {
public static void main(String[] args) {
	Array_Types arr=new Array_Types();
	arr.ltr_Arr();
	//arr.non_Ltr();
	}
public void ltr_Arr() {
	int [] lit= {1,2,3,4};
	
	for(int i=0;i<lit.length;i++) {
		System.out.println(lit[i]);
	}	
	for(int loop:lit) {
		System.out.println(loop);
	}
	
}
public void non_Ltr() {
	int[] nonLtr=new int[4];
	nonLtr[0]=10;
	nonLtr[1]=20;
	nonLtr[2]=30;
	
	for(int i=0;i<nonLtr.length;i++) {
		
	System.out.println(nonLtr[i]);
	
}
	//enhanced forloop or foreach loop
	//for(datatype varName:arrayName){
	//system.out.println(varName);
	//}
	
	for(int each:nonLtr) {
		System.out.println(each);
	}
	
}


}
