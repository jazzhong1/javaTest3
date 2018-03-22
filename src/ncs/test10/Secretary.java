package ncs.test10;

public class Secretary extends Employee{
	
	public Secretary(){
		
	}
	
	public Secretary(String name,int number,String department,int salary) {
			this.setName(name);
			this.setNumber(number);
			this.setDepartment(department);
			this.setSalary(salary);
	}

	@Override
	public double tax() {
		double sal=this.getSalary()*0.1;
		return sal;
	}
	
	public void incentive(int pay){
		double incen=pay*0.8;
		this.setSalary((int)incen+this.getSalary());
	}

}
