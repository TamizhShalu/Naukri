package com.DataTypes;

public class Nested_If_Task {
	public static void main(String[] args) {
		Nested_If_Task nIT = new Nested_If_Task();
		nIT.nests_BloodTask();
	}

	public void nests_BloodTask() {
		int age = 18;
		int weight = 55;
		String bloodGrp = "AB+";

		if (age == 18) {
			if (weight == 55) {
				if (bloodGrp == "AB+") {
					System.out.println("you are eligible for donation");

				} else {
					System.out.println("AB+ bloodgroup only valid");
				}
			} else {
				System.out.println("weight should be above 50");
			}
		} else {
			System.out.println("above 18+ is eligible");
		}
	}
}
