package com.DataTypes;

public class MultiDimentional_Array {
public static void main(String[] args) {
	//mul_Lit();
	//mul_nonLit(); 
	mul_nonLit1();
}

public static void mul_Lit() {
	int[][] mulLit= {{10,20},{30,40}};
	//System.out.println(mulLit[1][1]);
	for(int i=0;i<mulLit.length;i++) {
		for(int j=0;j<mulLit.length;j++) {
			System.out.print(mulLit[i][j]+"  ");
			
		}
		System.out.println();
	}
	
}
public static void mul_nonLit() {
	int[][] mulNonLit=new int[2][2];
	mulNonLit[0][0]=1;
	mulNonLit[0][1]=2;
	mulNonLit[1][0]=3;
	mulNonLit[1][1]=4;
	for(int i=0;i<mulNonLit.length;i++) {
		for(int j=0;j<mulNonLit.length;j++) {
			System.out.print(mulNonLit[i][j]+" ");
		
		}
		System.out.println();
	}
}
public static void mul_nonLit1() {
	int[][] mulNonLit=new int[2][2];
	mulNonLit[0][0]=1;
	mulNonLit[0][1]=2;
	mulNonLit[1][0]=3;
	mulNonLit[1][1]=4;
	for(int[] eachrow:mulNonLit) {
		for(int eachvalue:eachrow) {
			System.out.println(eachvalue);
		}
	}
}
}
