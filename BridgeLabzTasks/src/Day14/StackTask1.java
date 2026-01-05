package Day14;

import java.util.Stack;

public class StackTask1 {

	public static void main(String[] args) {
		StackOperation stack = new StackOperation();

	        // Push elements: 70 first, then 30, then 56 to make 56 on top
	        stack.push(70);
	        stack.push(30);
	        stack.push(56);

	        System.out.println("Stack: " + stack.display()); // 56->30->70
	        System.out.println("Top element: " + stack.peek());

	}

}
