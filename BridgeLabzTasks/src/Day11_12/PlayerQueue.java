package Day11_12;

public class PlayerQueue {
	Node front,rear;
	
	public void enqueue(Player player) {
		Node newNode=new Node(player);
		if(rear==null) {
			front=rear=newNode;
		}
		else {
			rear.next=newNode;
			rear=newNode;
		}
	}
	public void printAllPlayers() {
        Node temp = front;
        while (temp != null) {
            Player p = (Player) temp.data;
            p.sortCards();
            p.printPlayerCards();
            temp = temp.next;
        }
    }

}
