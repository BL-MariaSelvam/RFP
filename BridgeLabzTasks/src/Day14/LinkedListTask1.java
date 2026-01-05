package Day14;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListTask1 {

	public static void main(String[] args) {
		Node first=new Node(56);
		Node second=new Node(30);
		Node third=new Node(70);
		
		first.next=second;
		second.next=third;
		
		Node current=first;
		while(current!=null) {
			System.out.print(current.data+" -> ");
			current=current.next;
		}
		System.out.println("Null");

	}

}
