package Day14;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class Searching{
	Node head;
	 // Add element to the list
    void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Search node with given key
    Node search(int key) {
        Node current = head;

        // Loop through LinkedList
        while (current != null) {
            if (current.data == key) {
                return current; // node found
            }
            current = current.next;
        }
        return null; // node not found
    }

}

public class FindNodeTask5 {

	@Test
    public void givenLinkedList_whenSearchKey30_shouldReturnNode() {

        // Arrange
		Searching list = new Searching();
        list.append(56);
        list.append(30);
        list.append(70);

        // Act
       Node foundNode = list.search(30);

        // Assert
        assertNotNull(foundNode, "Node with value 30 should be found");
        assertEquals(30, foundNode.data, "Node value should be 30");
    }

}
