package com.collect;

import java.util.HashSet;
import java.util.Set;

public class HashSettt {
public static void main(String[] args) {
	hashhset();
}
public static void hashhset() {
	Set<Integer> s=new HashSet<Integer>();
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(3);
	s.add(null);
	s.add(null);
	System.out.println(s);
}
}
