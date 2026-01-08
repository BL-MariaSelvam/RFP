package Day21;

public class MoodAnalyzer {

	    public String analyzeMood(String mood) throws InvalidMoodException {

	        if (mood == null) {
	            throw new InvalidMoodException("Mood cannot be NULL");
	        }

	        if (mood.trim().isEmpty()) {
	            throw new InvalidMoodException("Mood cannot be EMPTY");
	        }

	        mood = mood.toLowerCase();

	        switch (mood) {
	            case "happy":
	                return "User is Happy 😊";
	            case "sad":
	                return "User is Sad 😢";
	            case "angry":
	                return "User is Angry 😠";
	            default:
	                throw new InvalidMoodException("Invalid mood provided: " + mood);
	        }
	    }
	}
