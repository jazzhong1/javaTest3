package ncs.test7;

public class Student extends Human{
	
	private int number;
	private String major;
	
	
	public Student() {
	}
	
	public Student(String name, int age, int height, int weight,int number,String major) {
		this.setName(name);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setNumber(number);
		this.setMajor(major);
	}
	
	
	
	@Override
	public String toString() {
		
		
		String result=super.toString()+this.getNumber()+" "+this.getMajor();
		//부모생성자+ Student 추가값
		
		return result;
		
	}
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}




}
