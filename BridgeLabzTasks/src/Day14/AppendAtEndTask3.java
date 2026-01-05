package Day14;

class LinkedList1{
	Node head;
	
	void append(int data) {
		Node newnode=new Node(data);
		
		if(head==null) {
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
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

public class AppendAtEndTask3 {

	public static void main(String[] args) {
		LinkedList1 ll1=new LinkedList1();
		ll1.append(56);
		ll1.append(30);
		ll1.append(70);
		ll1.display();

	}

}
