package Day14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Delete{
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
                return temp; // found
            }
            temp = temp.next;
        }
        return null; // not found
    }

    // Delete node with key
    public boolean delete(int key) {

        if (head == null) {
            return false;
        }

        // If head needs to be deleted
        if (head.data == key) {
            head = head.next;
            return true;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.data == key) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false; // key not found
    }

    // Get size of LinkedList
    public int size() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Display list as string
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

class LinkedListTest {

    @Test
    public void testDelete40AndCheckSize() {

        Delete list = new Delete();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        // Search for node 40
        Node node = list.search(40);
        assertNotNull(node, "Node with key 40 should be found");

        // Delete node 40
        boolean deleted = list.delete(40);
        assertTrue(deleted, "Node 40 should be deleted");

        // Check final sequence
        assertEquals("56->30->70", list.display());

        // Check size
        assertEquals(3, list.size(), "LinkedList size should be 3");
    }
}

public class DeletionInBetweenTask8 {

	public static void main(String[] args) {
		
		Delete list = new Delete();
	        list.add(56);
	        list.add(30);
	        list.add(40);
	        list.add(70);

	        list.delete(40);

	        System.out.println(list.display());
	        System.out.println("Size: " + list.size());
		// TODO Auto-generated method stub

	}

}
