package com.exp;

import java.util.List;
import java.util.Vector;

public class ArryIndx_Exp {
	public static void main(String[] args) {
		vec_List();
	}
	public static void vec_List() {
		List<Integer> lst=new Vector<Integer>();
		lst.add(1);
		lst.add(2);
		System.out.println(lst);
		lst.remove(3);
		System.out.println(lst);
}
}
