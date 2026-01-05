package Day14;

public class StackTask2{
		    public static void main(String[] args) {
	    	        StackOperation stack = new StackOperation();

	    	        // Push elements: 70 first, then 30, then 56 to make 56 on top
	    	        stack.push(70);
	    	        stack.push(30);
	    	        stack.push(56);

	    	        System.out.println("Initial Stack: " + stack.display()); // 56->30->70

	    	        // Peek and pop until empty
	    	        while (!stack.isEmpty()) {
	    	            System.out.println("Peek: " + stack.peek());
	    	            System.out.println("Pop: " + stack.pop());
	    	            System.out.println("Stack now: " + stack.display());
	    	            System.out.println("--------------------");
	    	        }
	    	    }
	    	}
