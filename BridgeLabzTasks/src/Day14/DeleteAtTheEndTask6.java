package Day14;

class Deletion{
	Node head;
	Node tail;
	
	 // Add node at end
    void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    
    // Delete last element (popLast)
    void popLast() {
        if (head == null) {
            return; // empty list
        }

        // If only one element
        if (head.next == null) {
            head = tail = null;
            return;
        }

        // Traverse to second last node
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        current.next = null;
        tail = current; // new tail
    }
    
 // Display list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
	
}

}
public class DeleteAtTheEndTask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Deletion list = new Deletion();

	        // Initial sequence: 56 -> 30 -> 70
	       list.append(56);
	       list.append(30);
	       list.append(70);

	        System.out.print("Original List: ");
	        list.display();

	        // Remove last element
	        list.popLast();

	        System.out.print("Final List: ");
	        list.display();
		
		
	}

}


