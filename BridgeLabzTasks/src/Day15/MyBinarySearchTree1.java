package Day15;

public class MyBinarySearchTree1<K extends Comparable<K>> {

    private INode<K> root;

    public void add(K key) {
        root = addRecursively(root, key);
    }

    private INode<K> addRecursively(INode<K> current, K key) {

        if (current == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(current.getKey()) < 0) {
            current.setLeft(addRecursively(current.getLeft(), key));
        } 
        else if (key.compareTo(current.getKey()) > 0) {
            current.setRight(addRecursively(current.getRight(), key));
        }

        return current;
    }

    // 🔢 Size method
    public int size() {
        return sizeRecursively(root);
    }

    private int sizeRecursively(INode<K> node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeRecursively(node.getLeft())
                 + sizeRecursively(node.getRight());
    }
}

