package Day14;
class LinkedList4{
	Node head;

    // Pop method: deletes the first node
    void pop() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Move head to the next node
        head = head.next;
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

public class DeleteAttheBeginningTask5 {

	public static void main(String[] args) {
		 LinkedList4 list = new LinkedList4();

	        // Create list: 56 -> 30 -> 70
	        list.head = new Node(56);
	        list.head.next = new Node(30);
	        list.head.next.next = new Node(70);

	        // Delete first element
	        list.pop();

	        // Final list
	        list.display();

	}

}
