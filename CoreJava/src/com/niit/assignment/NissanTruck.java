package com.niit.assignment;

//import iTruck;

class NissanTruck extends iTruck{	 
	 
	 public NissanTruck(int axless,int weightt){
		 	this.axles=axless;
	 this.total_weight=weightt;
	 }
	   

	public NissanTruck() {
		
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
