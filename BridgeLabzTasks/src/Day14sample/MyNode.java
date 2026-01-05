package Day14sample;

public class MyNode<K> {
	private K key;
	private MyNode next;
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	public MyNode(K key) {
		this.key=key;
		this.next=null;
	}
}
