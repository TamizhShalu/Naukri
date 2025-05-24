package com.collect;

import java.util.List;
import java.util.Vector;

public class Vec {
public static void main(String[] args) {
	vec_List();
}
public static void vec_List() {
	List<Integer> lst=new Vector<Integer>();
	lst.add(1);
	lst.add(2);
	System.out.println(lst);
	List<Integer> lst1=new Vector<Integer>();
	lst1.add(3);
	lst1.add(4);
	System.out.println(lst1);
	lst.addAll(lst1);
	System.out.println(lst);
	lst.retainAll(lst1);
	System.out.println(lst);
	lst.remove(4);
	System.out.println(lst);
	lst.set(0,10);
	System.out.println(lst);
	
}
}
