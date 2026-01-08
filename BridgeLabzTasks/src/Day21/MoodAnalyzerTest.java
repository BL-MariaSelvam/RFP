package Day21;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
	
	MoodAnalyzer mood;
	
	  @Test
	    void givenNullMood_shouldThrowInvalidMoodException() {
	        MoodAnalyzer analyzer = new MoodAnalyzer();

	        Exception exception = assertThrows(
	                InvalidMoodException.class,
	                () -> analyzer.analyzeMood(null)
	        );

	        assertEquals("Mood cannot be NULL", exception.getMessage());
	    }

	    @Test
	    void givenEmptyMood_shouldThrowInvalidMoodException() {
	        MoodAnalyzer analyzer = new MoodAnalyzer();

	        Exception exception = assertThrows(
	                InvalidMoodException.class,
	                () -> analyzer.analyzeMood(" ")
	        );

	        assertEquals("Mood cannot be EMPTY", exception.getMessage());
	    }

	    @Test
	    void givenHappyMood_shouldReturnHappyMessage() throws InvalidMoodException {
	        MoodAnalyzer analyzer = new MoodAnalyzer();

	        String result = analyzer.analyzeMood("happy");

	        assertEquals("User is Happy 😊", result);
	    }

	    @Test
	    void givenInvalidMood_shouldThrowInvalidMoodException() {
	        MoodAnalyzer analyzer = new MoodAnalyzer();

	        Exception exception = assertThrows(
	                InvalidMoodException.class,
	                () -> analyzer.analyzeMood("excited")
	        );

	        assertTrue(exception.getMessage().contains("Invalid mood"));
	    }
}
