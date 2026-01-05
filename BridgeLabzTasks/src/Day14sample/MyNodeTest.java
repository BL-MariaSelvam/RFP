package Day14sample;

import org.junit.Assert;
import org.junit.Test;


public class MyNodeTest {
	@Test
	public void given3NumberswhenlinkedshouldPassesLinkedListTest() {
		MyNode<Integer> myfirstNode=new MyNode<>(56);
		MyNode<Integer> mysecondNode=new MyNode<>(30);
		MyNode<Integer> mythirdNode=new MyNode<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		boolean result=myfirstNode.getNext().equals(mysecondNode) &&
				myfirstNode.getNext().getNext().equals(mythirdNode);
		Assert.assertTrue(result);
		
		}

}
