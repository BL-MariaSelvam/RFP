package Day15;

public class BSTMain {

    public static void main(String[] args) {

        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        bst.add(56); // root
        bst.add(30); // left of 56
        bst.add(70); // right of 56

        System.out.println("Root Node: " + bst.getRoot().getKey());
        System.out.println("Left Child: " + bst.getRoot().getLeft().getKey());
        System.out.println("Right Child: " + bst.getRoot().getRight().getKey());
    }
}

