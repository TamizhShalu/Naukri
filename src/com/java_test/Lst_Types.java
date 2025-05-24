package com.java_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lst_Types {
public static void main(String[] args) {
	 arr_lst();
	 lnkd_lst();
	 vctr();
}
public static void arr_lst() {
	List<Integer> a=new ArrayList<Integer>();
	a.add(10);
	a.add(20);
	a.add(20);
	a.add(50);
	a.add(30);
	System.out.println(a);
	for(int each:a) {
		System.out.println(each);
	}
}
public static void lnkd_lst() {
	List<Integer> l=new LinkedList<Integer>();
	l.add(20);
	l.add(10);
	l.add(null);
	l.add(null);
	l.add(30);
	System.out.println(l);
}
public static void vctr() {
	List<Integer> v=new Vector<Integer>();
	v.add(30);
	v.add(10);
	v.add(40);
	v.add(null);
	System.out.println(v);
	
	
}
}
