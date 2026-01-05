package Day15;

public class RemoveWord {

    public static void main(String[] args) {

        String paragraph =
                "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into " +
                "paranoid avoidable situations";

        String[] words = paragraph.toLowerCase().split(" ");

        MyHashTable<String, Integer> hashTable = new MyHashTable<>();

        // Insert words into Hash Table
        for (String word : words) {
            Integer count = hashTable.get(word);

            if (count == null) {
                hashTable.put(word, 1);
            } else {
                hashTable.put(word, count + 1);
            }
        }

        System.out.println("Before removing 'avoidable':");
        hashTable.display();

        // 🔥 Remove "avoidable"
        hashTable.remove("avoidable");

        System.out.println("\nAfter removing 'avoidable':");
        hashTable.display();
    }
}

