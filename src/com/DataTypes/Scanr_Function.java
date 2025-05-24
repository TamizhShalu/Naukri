package com.DataTypes;

import java.util.Scanner;

public class Scanr_Function {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	String name=sc.nextLine();
	System.out.println("Employee Name is: "+name);
	
	System.out.println("Employee Location:");
	String loc=sc.next();
	System.out.println("Employee Location is:"+loc);
	
	System.out.println("Employee age:");
	byte age=sc.nextByte();
	System.out.println("Employee age is:"+age);
	
		System.out.println("Employee Id: ");
	int id=sc.nextInt();
	System.out.println("Employee Id is: "+id);
	
	System.out.println("Employee Phone no:");
	long num=sc.nextLong();
	System.out.println("Employee PhoneNumber is:"+num);
	
	System.out.println("Employee Salary: ");
	float sal=sc.nextFloat();
	System.out.println("Employee salary is: "+sal);
	
	System.out.println("Employee grade: ");
	char grade=sc.next().charAt(0);
	System.out.println("Employee grade is:" +grade);
	
	System.out.println("Employee bankBal:");
	double bal=sc.nextDouble();
	System.out.println("Employee Bankbalance is:"+bal);
	
	System.out.println("Employee is eligible for Appraisal:");
	boolean app=sc.nextBoolean();
	System.out.println("Employee is eligible for Appraisal:"+app);

	
	
	}
}
