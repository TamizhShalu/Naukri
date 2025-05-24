package com.collect;

import java.util.LinkedList;
import java.util.List;

public class Lnkd_Lst {
public static void main(String[] args) {
	lnkd_Lst();
}
public static void lnkd_Lst() {
	List<Integer> lst1=new LinkedList<Integer>();
	lst1.add(10);
	lst1.add(10);
	lst1.add(null);
	lst1.add(20);
	lst1.add(30);
	System.out.println(lst1);

for(int i=0;i<lst1.size();i++) {
	System.out.println(lst1.get(i));
}

}
}