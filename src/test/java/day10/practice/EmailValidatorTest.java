package day10.practice;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

	@Test
	public void checkEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an email address: ");
		String email = scan.nextLine();
		System.out.println("Your given email id is " + email);

		try {
			boolean isValid = EmailValidator.isValidEmail(email);
			System.out.println("Is the email valid? " + isValid);
			assertTrue(isValid);
		} catch (ValidateEmailException e) {
			System.out.println("Email is invalid !");
			System.out.println("Error: " + e.getMessage());
		} finally {
			// Close the Scanner after the test is completed.
			scan.close();
		}
	}
}
