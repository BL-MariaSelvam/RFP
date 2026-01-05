package Day15;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashTable<k,v> {
	private final int SIZE=10;
	private LinkedList<MymapNode<k,v>>[] buckets;

	 public MyHashTable() {
	        buckets = new LinkedList[SIZE];
	    }

	    private int getBucketIndex(k key) {
	        return Math.abs(key.hashCode()) % SIZE;
	    }

	    public void put(k key, v value) {
	        int index = getBucketIndex(key);

	        if (buckets[index] == null) {
	            buckets[index] = new LinkedList<>();
	        }

	        for (MymapNode<k, v> node : buckets[index]) {
	            if (node.key.equals(key)) {
	                node.value = value;
	                return;
	            }
	        }

	        buckets[index].add(new MymapNode<>(key, value));
	    }

	    public v get(k key) {
	        int index = getBucketIndex(key);

	        if (buckets[index] == null) {
	            return null;
	        }

	        for (MymapNode<k, v> node : buckets[index]) {
	            if (node.key.equals(key)) {
	                return node.value;
	            }
	        }
	        return null;
	    }

	    // 🔥 REMOVE OPERATION
	    public void remove(k key) {
	        int index = getBucketIndex(key);

	        if (buckets[index] == null) {
	            return;
	        }

	        Iterator<MymapNode<k, v>> iterator = buckets[index].iterator();

	        while (iterator.hasNext()) {
	            MymapNode<k, v> node = iterator.next();
	            if (node.key.equals(key)) {
	                iterator.remove();   // removes "avoidable"
	                return;
	            }
	        }
	    }

	    
	    public void display() {
	        for (LinkedList<MymapNode<k, v>> bucket : buckets) {
	            if (bucket != null) {
	                for (MymapNode<k, v> node : bucket) {
	                    System.out.println(node.key + " : " + node.value);
	                }
	            }
	        }
	 
}
}
