package com.java_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hsh_mappp {
public static void main(String[] args) {
	hsh_Mapp();
}
public static void hsh_Mapp() {
	Map<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(10,"Tamizh");
	hm.put(20,"null");
	hm.put(20,"null");
	hm.put(null,"shalu");
	hm.put(null,"vinu");
	System.out.println(hm);
	Map<Integer,String> hm1=new HashMap<Integer,String>();
	hm1.put(40,"raji");
	hm1.put(50,"vish");
	System.out.println(hm1);
	hm.putAll(hm1);
	System.out.println(hm);
	int size=hm.size();
	System.out.println(hm.size());
	hm.get("vinu");
	System.out.println(hm.get("vinu"));
	Set<Integer> keySet=hm.keySet();
	System.out.println(keySet);
	
	

    
    

}
}
