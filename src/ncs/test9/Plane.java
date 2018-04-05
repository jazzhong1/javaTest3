package ncs.test9;

public abstract class Plane {
	
	private String planeName;
	private int fuel;	//size
	public Plane() {
		
	}
	public Plane(String planeName,int fuel) {
		//초기화
		
	}
	
	public void refuel(int fuel) {
		this.setFuel(this.getFuel()+fuel);
	};	//주유
	
	public abstract void flight(int distance);	//운항
	
	
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

}
