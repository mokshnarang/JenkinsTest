package com.niit.assignment;



class AlleghenyTollBooth extends iToolBooth{

	@Override
	public void calculateToll(iTruck h) {
		
		
		int total=h.axles*h.total_weight;
		System.out.println("ur total due will be" + total);
		
		
	}


	@Override
	void displayData() {
		// TODO Auto-generated method stub
System.out.println("truck details is as follows");
		
		FordTruck f1=new FordTruck();
		f1.getTruckDetails();
		
		//m.getTruckDetails();
		
		DeawooTruck d1=new DeawooTruck();
		d1.getTruckDetails();
		
		NissanTruck n1=new NissanTruck();
		n1.getTruckDetails();
	}


	@Override
	void getTruckDetails() {
		// TODO Auto-generated method stub
		
	}

	}
	