package Day20;

public class MoodAnalyzer {

	public String analyzeMood(String message) {
		if(message.contains("happy")) {
			return "HAPPY";
		}
		else if (message.contains("sad")){
			return "SAD";
		}
		else {
			return null;
		}
	}

}
