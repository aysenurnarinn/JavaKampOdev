package kamp;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "sisteme ba�ar�yla eklendi.");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "sistemden ba�ar�yla silindi.");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "sistemde ba�ar�yla g�ncellendi.");
	}
}
