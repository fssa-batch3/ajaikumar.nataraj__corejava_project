package day03.practice;

public class User {

	private String username;
	private String useremail;
	private String userpassword;

	public User(String username, String useremail, String userpassword) {
		this.username = username;
		this.useremail = useremail;
		this.userpassword = userpassword;
	}

	public String getEmail() {
		return useremail;
	}

	public String getName() {
		return username;
	}
	public String getPassword() {
		return userpassword;
	}

	public static void main(String[] args) {

		User use = new User("Ajaikumar", "ajaikumarnatarajan@gmail.com", "Ajai@1235");

		System.out.println("User name : " + use.getName());
		System.out.println("User email : " + use.getEmail());
		System.out.println("User password : " + use.getPassword());

	}

}
