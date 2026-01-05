package Day15;

public class MyBinarySearchTree<K extends Comparable<K>> {

    private INode<K> root;

    public void add(K key) {
        this.root = addRecursively(root, key);
    }

    private INode<K> addRecursively(INode<K> current, K key) {

        if (current == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(current.getKey()) < 0) {
            current.setLeft(addRecursively(current.getLeft(), key));
        } else if (key.compareTo(current.getKey()) > 0) {
            current.setRight(addRecursively(current.getRight(), key));
        }

        return current;
    }

    public INode<K> getRoot() {
        return root;
    }
}

