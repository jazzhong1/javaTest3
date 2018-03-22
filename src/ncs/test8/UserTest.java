package ncs.test8;

public class UserTest {
	public static void main(String[] args) {

		User[] users=new User[3];
		
		users[0]=new User("user01","pass01","김철수",32,'M',"010-1234-5678");
		users[1]=new User("user01","pass02","이영희",25,'F',"010-5555-7777");
		users[2]=new User("user03","pass03","김철수",32,'M',"010-1234-5678");
		
		
		User[] copyUsers = new User[users.length];
		
		for (int i = 0; i < copyUsers.length; i++) {
			copyUsers[i]=(User) users[i].clone();
		}
		
		

		
		System.out.println("user list --------------");
		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i].toString());
		}
		
		System.out.println("copyUsers --------------");
		for (int i = 0; i < users.length; i++) {
			System.out.println(copyUsers[i].toString());
		}
		System.out.println("비교결과-----------------");
		
		for (int i = 0; i < copyUsers.length; i++) {
			boolean r=users[i].equals(copyUsers[i]);
			System.out.println(r);
		}
		
		
	}
}
