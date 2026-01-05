package Day14;

class LinkedList{
	Node head;
	
	void addAtBeginning(int data) {
	Node newNode=new Node(data);
	newNode.next=head;
	head=newNode;
	}
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
}

public class INsertAtBeginningLLTask2 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.addAtBeginning(70);
		ll.addAtBeginning(30);
		ll.addAtBeginning(56);
		
		ll.display();

	}

}
