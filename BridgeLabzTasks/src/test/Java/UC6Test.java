package test.Java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Day19.UC6;

class UC6Test {

	@Test
	void givenValidEmails_shouldReturnTrue() {
        assertTrue(UC6.validateEmail("abc@yahoo.com"));
        assertTrue(UC6.validateEmail("abc-100@yahoo.com"));
        assertTrue(UC6.validateEmail("abc.100@yahoo.com"));
        assertTrue(UC6.validateEmail("abc111@abc.com"));
        assertTrue(UC6.validateEmail("abc-100@abc.net"));
        assertTrue(UC6.validateEmail("abc.100@abc.com.au"));
        assertTrue(UC6.validateEmail("abc@1.com"));
        assertTrue(UC6.validateEmail("abc@gmail.com.com"));
        assertTrue(UC6.validateEmail("abc+100@gmail.com"));
    }
	
	@Test
	void givenInvalidEmails_shouldReturnFalse() {
	    assertFalse(UC6.validateEmail("abc"));
	    assertFalse(UC6.validateEmail("abc@.com.my"));
	    assertFalse(UC6.validateEmail("abc123@gmail.a"));
	    assertFalse(UC6.validateEmail("abc123@.com"));
	    assertFalse(UC6.validateEmail("abc123@.com.com"));
	    assertFalse(UC6.validateEmail(".abc@abc.com"));
	    assertFalse(UC6.validateEmail("abc()*@gmail.com"));
	    assertFalse(UC6.validateEmail("abc@%*.com"));
	    assertFalse(UC6.validateEmail("abc..2002@gmail.com"));
	    assertFalse(UC6.validateEmail("abc@gmail.com."));
	    assertFalse(UC6.validateEmail("abc@abc@gmail.com"));
	    assertFalse(UC6.validateEmail("abc@gmail.com.1a"));
	    assertFalse(UC6.validateEmail("abc@gmail.com.aa.au"));
	}

}
