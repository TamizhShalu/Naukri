package com.collect;

import java.util.LinkedHashSet;
import java.util.Set;

public class LnkdHashSett {
public static void main(String[] args) {
	lnkdhshset();
}
public static void lnkdhshset() {
	Set<Integer> s=new LinkedHashSet<Integer>();
	s.add(10);
	s.add(10);
	s.add(null);
	s.add(20);
	s.add(30);
	s.add(null);
	s.add(40);
	System.out.println(s);
}
}
