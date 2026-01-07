package Day21;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	 public void validateFirstName(String firstName) throws InvalidFirstNameException {
	        if (!Pattern.matches("^[A-Z][a-z]{2,}$", firstName)) {
	            throw new InvalidFirstNameException(
	                "First Name must start with Capital letter and have minimum 3 characters");
	        }
	    }

	    public void validateLastName(String lastName) throws InvalidLastNameException {
	        if (!Pattern.matches("^[A-Z][a-z]{2,}$", lastName)) {
	            throw new InvalidLastNameException(
	                "Last Name must start with Capital letter and have minimum 3 characters");
	        }
	    }

	    public void validateEmail(String email) throws InvalidEmailException {
	        String pattern = "^[a-z0-9]+([\\.\\-\\+][a-z0-9]+)*@[a-z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$";
	        if (!Pattern.matches(pattern, email)) {
	            throw new InvalidEmailException("Invalid Email format");
	        }
	    }

	    public void validateMobile(String mobile) throws InvalidMobileNoException {
	        if (!Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", mobile)) {
	            throw new InvalidMobileNoException(
	                "Mobile number must have country code and 10-digit number");
	        }
	    }

	    public void validatePassword(String password) throws InvalidPasswordException {
	        String pattern =
	            "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
	        if (!Pattern.matches(pattern, password)) {
	            throw new InvalidPasswordException(
	                "Password must have min 8 chars, 1 uppercase, 1 digit, 1 special char");
	        }
	    }
	
}
