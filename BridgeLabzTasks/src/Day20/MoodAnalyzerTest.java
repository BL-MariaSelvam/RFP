package Day20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
	
	MoodAnalyzer mood;
	
	@BeforeEach
	public void initialize() {
		mood=new MoodAnalyzer();
	}
	
	@Test
	public void testsadmood() {
		String myMood=mood.analyzeMood("This is mood");
		Assertions.assertEquals("SAD", myMood);
	}

	
	@Test
	public void testhappymood() {
		String myMood=mood.analyzeMood("This is happy mood");
		Assertions.assertEquals("HAPPY", myMood);
	}
}
