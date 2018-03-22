package ncs.test8;


public class User implements Cloneable {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;

	public User() {
		
	}
	
	public User(String id, String name, String password, int age, char gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		
		String result = this.getId() + " " + this.getName() + " " + 
						this.getPassword() + " " + this.getAge() + " "+ 
						this.getGender() + " " + this.getPhone();
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User u=(User)obj;
			if(this.name.equals(u.getName())
					&& this.id.equals(u.getId())
					&& this.password.equals(u.getPassword())
					&& this.age==u.getAge()
					&& this.phone.equals(u.getPhone())
					&& this.gender==u.getGender()) {
				return true;
			}
			else return false;
		}
		
		else return false;
	}
	
	@Override
	public Object clone() {
		User temp = new User();
		temp.setId(this.id);
		temp.setPassword(this.password);
		temp.setName(this.name);
		temp.setAge(age);
		temp.setGender(this.gender);
		temp.setPhone(this.phone);
		
		return temp;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	

}
