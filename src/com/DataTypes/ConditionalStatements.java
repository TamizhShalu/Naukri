package com.DataTypes;

public class ConditionalStatements {
public static void main(String[] args) {
	ConditionalStatements cs=new ConditionalStatements();
	cs.if_condition();
	cs.else_lader();
}
public void if_condition() {
	int mark=90;
	if(mark==100) {
		System.out.println("centum");
				
	}
	else {
		System.out.println("not centum");
	}
}
public void else_lader() {
	int mark=95;
	if(mark==100) {
		System.out.println("centum");
	}
	else if(mark>=90) {
		System.out.println("grade A");
	}
	else if(mark>=80) {
		System.out.println("grade B");
		
	}

}

	
}
 