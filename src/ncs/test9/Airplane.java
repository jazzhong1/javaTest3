package ncs.test9;

public class Airplane extends Plane{
	
	public Airplane() {
	}
	
	public Airplane(String planeName,int fuelSize){
		this.setPlaneName(planeName);
		this.setFuel(fuelSize);
	}


	@Override
	public void flight(int distance) {
		this.setFuel(this.getFuel()-distance*3);
	}

}
