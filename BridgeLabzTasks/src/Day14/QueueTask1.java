package Day14;

public class QueueTask1{

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // front of the queue
    private Node rear;  // rear of the queue

    // Enqueue operation (append at end)
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) { // queue is empty
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue operation (remove from front)
    public int dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }

        int value = front.data;
        front = front.next;

        if (front == null) { // queue becomes empty
            rear = null;
        }

        return value;
    }

    // Peek front element
    public int peek() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display queue from front to rear
    public String display() {
        StringBuilder sb = new StringBuilder();
        Node temp = front;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append("->");
            temp = temp.next;
        }
        return sb.toString();
    }
}
