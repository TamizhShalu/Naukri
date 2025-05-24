package com.abstr;

public  class ShowroomOwner extends CustomerClass {
	public static void main(String[] args) {
		ShowroomOwner sho=new ShowroomOwner();
		sho.colour();
		sho.testDrive();
		sho.engine();
	}

	@Override
	public void testDrive() {
		System.out.println("Vineeth");
		
	}

}
