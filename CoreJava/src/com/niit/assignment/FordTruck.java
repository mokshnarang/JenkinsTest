package com.niit.assignment;

//import iTruck;


class FordTruck extends iTruck{
	 
	 public FordTruck(int axless,int weightt){
		 this.axles=axless;
		 this.total_weight=weightt;
	 }
	   

	public FordTruck() {
		
	}
	
	


	@Override
	public void getTruckDetails() {
		System.out.println("the fordtruck details are"+"axles:" + axles + "total weight:" + total_weight );
		
	}


	@Override
	void displaydata() {
		// TODO Auto-generated method stub
		
	}
}