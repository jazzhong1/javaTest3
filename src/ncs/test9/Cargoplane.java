package ncs.test9;

public class Cargoplane extends Plane{
	
	public Cargoplane() {
	}
	
	public Cargoplane(String planeName,int fuelSize) {
		this.setPlaneName(planeName);
		this.setFuel(fuelSize);
	}	

	
	@Override
	public void flight(int distance) {
			this.setFuel(this.getFuel()-distance*5);
			
		}
	}

