package com.collect;

import java.util.Set;
import java.util.TreeSet;

public class TreSet {
public static void main(String[] args) {
	treSett();
}
public static void treSett() {
	Set<Integer> s=new TreeSet<Integer>();
	s.add(20);
	s.add(30);
	s.add(10);
	s.add(30);
	s.add(9);
	s.add(20);
	s.add(0);
	System.out.println(s);
	
}
}
