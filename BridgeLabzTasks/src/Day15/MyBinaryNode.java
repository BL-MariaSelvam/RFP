package Day15;

public class MyBinaryNode<K extends Comparable<K>> implements INode<K> {

    private K key;
    private INode<K> left;
    private INode<K> right;

    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public K getKey() {
        return key;
    }

    public INode<K> getLeft() {
        return left;
    }

    public INode<K> getRight() {
        return right;
    }

    public void setLeft(INode<K> left) {
        this.left = left;
    }

    public void setRight(INode<K> right) {
        this.right = right;
    }
}
