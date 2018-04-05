package ncs.test7;

public abstract class Human {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Human() {
	}
	
	public Human(String name, int age, int height, int weight) {
	}
	//this.안해줌
	

	@Override
	public String toString() {
		
		String result=this.getName()+" "+this.getAge()+" "+this.getHeight()+" "+this.getWeight()+" ";
		
		return result;
	}
}
