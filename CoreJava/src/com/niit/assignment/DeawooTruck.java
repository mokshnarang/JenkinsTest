package com.niit.assignment;

//import iTruck;


class DeawooTruck extends iTruck{
	 
	 public DeawooTruck(int axless,int weightt){
		 this.axles=axless;
		 this.total_weight=weightt;
	 }
	   

	public DeawooTruck() {
		
	}


	@Override
	public void getTruckDetails() {
		System.out.println("the Nissan truck details are"+"axles:" + axles + "total weight:" + total_weight );
		
	}


	@Override
	void displaydata() {
		// TODO Auto-generated method stub
		
	}	

}