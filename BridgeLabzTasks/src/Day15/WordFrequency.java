package Day15;

public class WordFrequency {

    public static void main(String[] args) {

        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");

        MyHashTable<String, Integer> hashTable = new MyHashTable<>();

        for (String word : words) {
            Integer count = hashTable.get(word);

            if (count == null) {
                hashTable.put(word, 1);
            } else {
                hashTable.put(word, count + 1);
            }
        }

        hashTable.display();
    }
}
