import java.util.*;

abstract class iTruck{
	
	int axles=0;
	  int total_weight=0;
	//void setTruckDetails();
	abstract void getTruckDetails();
  
}

interface iToolBooth{
	
	void calculateToll(iTruck h);
	void displayData();
}

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
	
}
	
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
	
}
	
class AlleghenyTollBooth implements iToolBooth{

	@Override
	public void calculateToll(iTruck h) {
		
		
		int total=h.axles*h.total_weight;
		System.out.println("ur total due will be" + total);
		
		
	}

	@Override
	public void displayData() {
		
		System.out.println("truck details is as follows");
		
		FordTruck f1=new FordTruck();
		f1.getTruckDetails();
		
		DeawooTruck d1=new DeawooTruck();
		d1.getTruckDetails();
		
		NissanTruck n1=new NissanTruck();
		n1.getTruckDetails();
		
	}
	
	}
	
}
	
public class TestTollBooth {

	public static void main(String[] args) {
		
		iToolBooth booth = new AlleghenyTollBooth();
		
	}

}
