package Day14;

public class QueueMain2 {
    public static void main(String[] args) {
        QueueTask2 queue = new QueueTask2();

        // Enqueue elements: 56, 30, 70
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println("Initial Queue: " + queue.display()); // 56->30->70

        // Dequeue all elements from beginning
        while (!queue.isEmpty()) {
            System.out.println("Peek Front: " + queue.peek());
            System.out.println("Dequeue: " + queue.dequeue());
            System.out.println("Queue now: " + queue.display());
            System.out.println("--------------------");
        }
    }
}
