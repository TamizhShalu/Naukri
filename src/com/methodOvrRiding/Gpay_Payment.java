package com.methodOvrRiding;

public class Gpay_Payment extends Bank_Payment {
	public static void main(String[] args) {
		Gpay_Payment pay=new Gpay_Payment ();
		pay.payment();
		pay.bankDetails();
	}
public void payment() {
	int amt=50000;
	int purAmt=10000;
	int curBal=amt-purAmt;
	int avBal=curBal+(purAmt*5)/100;
	System.out.println(avBal);
	
}
}
