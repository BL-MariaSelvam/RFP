package Day14;

class LinkedList2{
	  Node head;

	    // Insert 30 after node with data 56
	    void insertAfter(int prevData, int newData) {

	        Node temp = head;

	        // Traverse to find the previous node
	        while (temp != null && temp.data != prevData) {
	            temp = temp.next;
	        }

	        // If previous node is found
	        if (temp != null) {
	            Node newNode = new Node(newData);
	            newNode.next = temp.next;
	            temp.next = newNode;
	        }
	    }

	    void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
}

public class InsertBetweenTask4 {

	public static void main(String[] args) {
		  LinkedList2 list = new LinkedList2();

	        // Create initial list: 56 -> 70
	        list.head = new Node(56);
	        list.head.next = new Node(70);

	        // Insert 30 between 56 and 70
	        list.insertAfter(56, 30);

	        // Final list
	        list.display();

	}

}
