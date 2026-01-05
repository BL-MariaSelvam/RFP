package Day15;

public class BinaryMainProgram {

    public static void main(String[] args) {

        BinarySearchTree2<Integer> bst = new BinarySearchTree2<>();

        // Create tree shown in the figure
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

        // 🔍 Search for 63
        boolean found = bst.search(63);

        if (found) {
            System.out.println("63 is found in the Binary Tree");
        } else {
            System.out.println("63 is not found in the Binary Tree");
        }
    }
}

