package com.collect;

import java.util.ArrayList;
import java.util.List;

public class Lst_Types {
public static void main(String[] args) {
	arry_Lst();
}
public static void arry_Lst() {
	List<Integer> lst1=new ArrayList<Integer>();
	lst1.add(10);
	lst1.add(20);
	lst1.add(10);
	lst1.add(null);
	lst1.add(20);
	lst1.add(null);
	//System.out.println(lst1.get(5));
	for(int i=0;i<lst1.size();i++) {
		System.out.println(lst1.get(i));
	}
	
}
}
