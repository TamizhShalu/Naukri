package com.java_test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hsh_sett {
public static void main(String[] args) {
	hst_settt();
}
public static void hst_settt() {
	Set<Integer> hs=new HashSet<Integer>();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	System.out.println(hs);
	Set<Integer> hs1=new HashSet<Integer>();
	hs1.add(4);
	hs1.add(5);
	System.out.println(hs1);
	hs.addAll(hs1);
	System.out.println(hs);
	hs.remove(4);
	System.out.println(hs);
	int size=hs.size();
	System.out.println(hs.size());
	boolean contains=hs.contains(3);
	System.out.println(hs.contains(3));
	boolean isempty=hs.isEmpty();
	System.out.println(hs.isEmpty());
	Iterator<Integer> it=hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
	
	
	
	
}
}
