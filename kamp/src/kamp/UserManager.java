package kamp;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "sisteme başarıyla eklendi.");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "sistemden başarıyla silindi.");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "sistemde başarıyla güncellendi.");
	}
}
