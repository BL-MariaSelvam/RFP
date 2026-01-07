package Day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {
	
	UserRegistration user;
	
	@BeforeEach
	public void initialize() {
		user=new UserRegistration();
	}
	
	@Test
    public void givenValidFirstName_shouldNotThrowException() {
        Assertions.assertDoesNotThrow(() ->
            user.validateFirstName("Rahul"));
    }

    @Test
    public void givenInvalidFirstName_shouldThrowException() {
        Assertions.assertThrows(InvalidFirstNameException.class, () ->
            user.validateFirstName("ra"));
    }
    
    @Test
    public void givenValidLastName_shouldNotThrowException() {
        Assertions.assertDoesNotThrow(() ->
            user.validateLastName("Sharma"));
    }

    @Test
    public void givenInvalidLastName_shouldThrowException() {
        Assertions.assertThrows(InvalidLastNameException.class, () ->
            user.validateLastName("sh"));
    }
    
    
    @ParameterizedTest
    @ValueSource(strings = {
        "abc@yahoo.com",
        "abc-100@yahoo.com",
        "abc.100@yahoo.com",
        "abc111@abc.com",
        "abc-100@abc.net",
        "abc.100@abc.com.au",
        "abc@1.com",
        "abc@gmail.com.com",
        "abc+100@gmail.com"
    })
    void validEmails_shouldNotThrowException(String email) {
        Assertions.assertDoesNotThrow(() ->
            user.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "abc",
        "abc@.com.my",
        "abc123@gmail.a",
        ".abc@abc.com",
        "abc()*@gmail.com",
        "abc..2002@gmail.com",
        "abc.@gmail.com",
        "abc@abc@gmail.com",
        "abc@gmail.com.1a",
        "abc@gmail.com.aa.au"
    })
    void invalidEmails_shouldThrowException(String email) {
        Assertions.assertThrows(InvalidEmailException.class, () ->
            user.validateEmail(email));
    }
    
    @Test
    public void validMobile_shouldNotThrowException() {
        Assertions.assertDoesNotThrow(() ->
            user.validateMobile("91 9876543210"));
    }

    @Test
    public void invalidMobile_shouldThrowException() {
        Assertions.assertThrows(InvalidMobileNoException.class, () ->
            user.validateMobile("9876543210"));
    }
    
}
