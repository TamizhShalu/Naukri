package com.interf;

public class Student implements Parent,Parent1 {
	public static void main(String[] args) {
		  Student stu=new  Student();
		  stu.mark1();
		  stu.mark2();
		  stu.mark5();
	}

	@Override
	public void mark1() {
		System.out.println("mark1 is 89");
		
	}

	@Override
	public void mark2() {
		System.out.println("mark2 is 99");
		
	}

	@Override
	public void mark3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mark4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mark5() {
		System.out.println("mark2 is 88");
		
	}

	@Override
	public void mark6() {
		// TODO Auto-generated method stub
		
	}


}
