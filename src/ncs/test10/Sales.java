package ncs.test10;

public class Sales extends Employee implements Bonus{
	
	public Sales(){
		
	}

	public Sales(String name, int number, String department, int salary) {
		this.setName(name);
		this.setNumber(number);
		this.setDepartment(department);
		this.setSalary(salary);
	}

	@Override
	public double tax() {
		double sal = this.getSalary() * 0.13;
		return sal;
	}
	
	@Override
	public void incentive(int pay) {
		
		double incen=pay*1.2;
		this.setSalary((int)incen+this.getSalary());
	}


}
