package day02.practice;

import day02.solved.Person;

public class User {

	private int id = 0;
	private String name = "";
	private String password = "";
	private String emialId = "";
	public static void main(String[] args) {
		User user = new User();
		user.setId(22);
		user.setName("Ajai");
		user.setEmialId("ajai@gmail.com");
		user.setPassword("Ajai@123");
		
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getEmialId());
		System.out.println(user.getPassword());
		
		

	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getEmialId() {
		return emialId;
	}
	public void setEmialId(String emialId) {
		this.emialId = emialId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
