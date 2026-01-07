package Day20;

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
	public void TestFirstNameValid() {
		boolean res=user.testFirstName();
		Assertions.assertTrue(res);
		
	}
	
	@Test
	public void TestFirstNameInValid() {
		boolean res=user.testFirstName();
		Assertions.assertFalse(res);
		
	}
	
	@Test
	public void TestLastNameValid() {
		boolean res=user.testLastName();
		Assertions.assertTrue(res);
		
	}
	
	@Test
	public void TestLastNameInValid() {
		boolean res=user.testLastName();
		Assertions.assertFalse(res);
		
	}
	@ParameterizedTest
    @ValueSource(strings = {
        "abc",
        "abc@.com.my",
        "abc123@gmail.a",
        "abc123@.com",
        "abc123@.com.com",
        ".abc@abc.com",
        "abc()*@gmail.com",
        "abc@%*.com",
        "abc..2002@gmail.com",
        "abc.@gmail.com",
        "abc@abc@gmail.com",
        "abc@gmail.com.1a",
        "abc@gmail.com.aa.au"
    })
    public void testvalidEmails(String email) {
        Assertions.assertTrue(user.testEmail(email),
                "Expected valid email but passed: " + email);
    }

	@Test
	public void TestMobileNoValid() {
		boolean res=user.testMobile();
		Assertions.assertTrue(res);
		
	}
	
	@Test
	public void TestMobileNoInValid() {
		boolean res=user.testMobile();
		Assertions.assertFalse(res);
		
	}	
	
	@Test
	public void TestPasswordValid() {
		boolean res=user.testPassword();
		Assertions.assertTrue(res);
		
	}
	
	@Test
	public void TestPasswordInValid() {
		boolean res=user.testPassword();
		Assertions.assertFalse(res);
		
	}	
}
