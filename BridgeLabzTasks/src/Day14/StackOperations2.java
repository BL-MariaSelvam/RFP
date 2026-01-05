package Day14;

public class StackOperations2 {

	    // Node class
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node top; // top of the stack

	    // Push operation
	    public void push(int data) {
	        Node newNode = new Node(data);
	        newNode.next = top;
	        top = newNode;
	    }

	    // Pop operation
	    public int pop() {
	        if (top == null) {
	            throw new RuntimeException("Stack is empty");
	        }
	        int value = top.data;
	        top = top.next;
	        return value;
	    }

	    // Peek operation
	    public int peek() {
	        if (top == null) {
	            throw new RuntimeException("Stack is empty");
	        }
	        return top.data;
	    }

	    // Check if stack is empty
	    public boolean isEmpty() {
	        return top == null;
	    }

	    // Display stack from top to bottom
	    public String display() {
	        StringBuilder sb = new StringBuilder();
	        Node temp = top;
	        while (temp != null) {
	            sb.append(temp.data);
	            if (temp.next != null) sb.append("->");
	            temp = temp.next;
	        }
	        return sb.toString();
	    }
	}



