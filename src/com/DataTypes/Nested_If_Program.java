package com.DataTypes;

public class Nested_If_Program {
	public static void main(String[] args) {
		Nested_If_Program nIP = new Nested_If_Program();
		nIP.nestd_Conditions();
	}

	public void nestd_Conditions() {
		int accNum = 9809778;
		int pin = 4646;
		int bankBal = 50000;
		int withdrawlAmt = 5000;

		if (accNum == 9809778) {
			if (pin == 4666) {
				if (bankBal >= withdrawlAmt) {
					System.out.println("customer can withdrawl money");

				} else {
					System.out.println("insufficient balance");
				}
			} else {
				System.out.println("invalid pin number");
			}
		} else {
			System.out.println("you have entered wrong acc number");
		}

	}

}
