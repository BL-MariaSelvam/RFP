package Day15;

public class BinarySearchTree2<K extends Comparable<K>> {

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
        } else if (key.compareTo(current.getKey()) > 0) {
            current.setRight(addRecursively(current.getRight(), key));
        }
        return current;
    }

    // 🔍 SEARCH METHOD
    public boolean search(K key) {
        return searchRecursively(root, key);
    }

    private boolean searchRecursively(INode<K> current, K key) {
        if (current == null) {
            return false;   // not found
        }

        if (key.compareTo(current.getKey()) == 0) {
            return true;    // found
        }

        if (key.compareTo(current.getKey()) < 0) {
            return searchRecursively(current.getLeft(), key);
        } else {
            return searchRecursively(current.getRight(), key);
        }
    }

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

