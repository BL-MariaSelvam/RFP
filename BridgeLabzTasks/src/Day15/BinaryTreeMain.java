package Day15;

public class BinaryTreeMain {

    public static void main(String[] args) {

        MyBinarySearchTree1<Integer> bst = new MyBinarySearchTree1<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(65);
        bst.add(3);
        bst.add(16);
        bst.add(63);
        bst.add(67);

        System.out.println("Size of Binary Tree: " + bst.size());
    }
}

