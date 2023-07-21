package day10.practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            String email = "ajai@gmail.com";
            EmailException.isValidEmail(email);

            ValidateUser user = new ValidateUser();
            user.register(new ValidateUser(1, "Ajai", email));
            user.register(new ValidateUser(1, "kumar", email));

            System.out.println("User registered successfully.");
        } catch (InvalidEmailException | UserAlreadyExistsException e) {
            e.printStackTrace();
        }
	}

}
