package com.DataTypes;

public class LoopingStatements {
public static void main(String[] args) {
	LoopingStatements ls=new LoopingStatements();
	//ls.entry_Whl_Loop();
	//ls.do_Whl();
	//ls.fr_Loop();
	//ls.nested_FrLoop();
     //ls.nst_FrLoop();
	ls.nst_frLoop();
	}

public void entry_Whl_Loop() {
	int val=10;
	while(val<5) {
		System.out.println(val);
		val++;
	}
	System.out.println("helo");
}

public void do_Whl() {
	int a=15;
	do {
		System.out.println(a);
		a++;
	}while(a<20);
	}

public void fr_Loop() {
	for(int i=1;i<=10;i++) {
		System.out.println("tamizh");
	
		
	}
	
}
public void nested_FrLoop() {
	for(int i=1;i<=5;i++) {
		System.out.println(i);
		for(int j=1;j<=5;j++) {
			System.out.println(j);
		}
	}
}

public void nst_FrLoop() {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
}
public void nst_frLoop() {
	for(int i=1;i<=4;i++) {
		//System.out.println("*");
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}

