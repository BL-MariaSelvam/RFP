package Day14;

class Insertion{
	 Node head;

	    // Add node at end
	    public void add(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	    // Search node with key
	    public Node search(int key) {
	        Node temp = head;
	        while (temp != null) {
	            if (temp.data == key) {
	                return temp; // key found
	            }
	            temp = temp.next;
	        }
	        return null; // key not found
	    }

	    // Insert newData after key
	    public boolean insertAfter(int key, int newData) {
	        Node current = search(key);

	        if (current == null) {
	            return false; // key not found
	        }

	        Node newNode = new Node(newData);
	        newNode.next = current.next;
	        current.next = newNode;
	        return true;
	    }

	    // Convert list to string (for checking output)
	    public String display() {
	        StringBuilder sb = new StringBuilder();
	        Node temp = head;

	        while (temp != null) {
	            sb.append(temp.data);
	            if (temp.next != null) {
	                sb.append("->");
	            }
	            temp = temp.next;
	        }
	        return sb.toString();
	    }
}

public class InsertInBetweenTask7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion list = new Insertion();
        list.add(56);
        list.add(30);
        list.add(70);

        list.insertAfter(30, 40);

        System.out.println(list.display());
	}

}
