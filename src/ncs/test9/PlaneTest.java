package ncs.test9;

public class PlaneTest {
	public static void main(String[] args) {
		
		Airplane airplane=new Airplane("L747",1000);
		Cargoplane cargoplane=new Cargoplane("C40",1000);
		
		
		System.out.println("Plane   fuelSize");
		System.out.println("--------------------");
		System.out.println(airplane.getPlaneName()+"      "+airplane.getFuel());
		System.out.println(cargoplane.getPlaneName()+"       "+cargoplane.getFuel());
		airplane.flight(100);
		cargoplane.flight(100);
		System.out.println("100운항");
		System.out.println("Plane   fuelSize");
		System.out.println("--------------------");
		System.out.println(airplane.getPlaneName()+"      "+airplane.getFuel());
		System.out.println(cargoplane.getPlaneName()+"       "+cargoplane.getFuel());
		
		airplane.refuel(200);
		cargoplane.refuel(200);
		System.out.println("200주유");
		System.out.println("Plane   fuelSize");
		System.out.println("--------------------");
		System.out.println(airplane.getPlaneName()+"      "+airplane.getFuel());
		System.out.println(cargoplane.getPlaneName()+"       "+cargoplane.getFuel());
		
		//따로 view메서드 만들라는 조건이없어서 만들지 않음.
		
		
		
	}
}
