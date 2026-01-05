package Day11_12;

public class CardQueue {
private Node front,rear;

public void enqueue(Card card) {
	Node newNode=new Node(card);
	if(rear==null) {
		rear=front=newNode;
	}
	else {
		rear.next=newNode;
		rear=newNode;
	}
}
public void sortByRank() {
    for (Node i = front; i != null; i = i.next) {
        for (Node j = i.next; j != null; j = j.next) {
            Card c1 = (Card) i.data;
            Card c2 = (Card) j.data;

            if (c1.getRankValue() > c2.getRankValue()) {
                Object temp = i.data;
                i.data = j.data;
                j.data = temp;
            }
        }
    }
}
    public void printCards() {
        Node temp = front;
        while (temp != null) {
            System.out.println("   " + temp.data);
            temp = temp.next;
        }
}
    
    
}
