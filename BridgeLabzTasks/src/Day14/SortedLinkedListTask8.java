package Day14;

class SortedLinkedList<T extends Comparable<T>> {

    // Node class
    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;

    // Add node in sorted order
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        // If list is empty or new node should be first
        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Find the correct position to insert
        Node<T> current = head;
        while (current.next != null && current.next.data.compareTo(data) < 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Display list as string
    public String display() {
        StringBuilder sb = new StringBuilder();
        Node<T> temp = head;

        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) {
                sb.append("->");
            }
            temp = temp.next;
        }

        return sb.toString();
    }

    // Get size of LinkedList
    public int size() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
public class SortedLinkedListTask8 {
    public static void main(String[] args) {

        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        System.out.println("Sorted LinkedList: " + list.display());
        System.out.println("Size: " + list.size());
    }
}
