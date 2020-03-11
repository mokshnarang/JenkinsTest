package com.niit.assignment;

//import AlleghenyTollBooth;
//import iToolBooth;


public class TestTollBooth {

	public static void main(String[] args) {
		
		iToolBooth booth = new AlleghenyTollBooth();
		iTruck ford = new FordTruck(5, 12000);
		iTruck nissan = new NissanTruck(2, 5000); 
		iTruck daewoo = new DeawooTruck(6, 17000); 
		
		
		
		booth.calculateToll(ford);
		booth.displayData(booth);
		booth.calculateToll(nissan);

		
	}

}