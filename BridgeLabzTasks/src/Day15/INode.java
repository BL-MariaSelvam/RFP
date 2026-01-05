package Day15;

public interface INode<K extends Comparable<K>> {
    K getKey();
    void setLeft(INode<K> left);
    void setRight(INode<K> right);
    INode<K> getLeft();
    INode<K> getRight();
}
