package kamp;

public class Main {

	public static void main(String[] args) {
	
		User[] users=new User[] {new Student() ,new Instructor()};
		for(User user:users) {
			System.out.println(user);
		}
		
		UserManager userManager=new UserManager();
		userManager.add(new Student());
		userManager.delete(new Instructor());
		
		
		
				
	}

}
