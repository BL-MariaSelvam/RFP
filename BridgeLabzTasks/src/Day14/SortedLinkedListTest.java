package Day14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortedLinkedListTest {

    @Test
    public void testSortedInsertion() {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        // Check the sorted sequence
        assertEquals("30->40->56->70", list.display(), "LinkedList should be sorted in ascending order");

        // Check size
        assertEquals(4, list.size(), "Size of LinkedList should be 4");
    }
}

