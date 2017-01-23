
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T> {
    private Node head;
    private Node tail;
    private int N;

    public LinkedList() {
        head = null;
        tail = null;
        N = 0;
    }

    public void add(T item) {
        if (item == null) { throw new NullPointerException("The first argument for addLast() is null."); }
        if (!isEmpty()) {
            Node prev = tail;
            tail = new Node(item, null);
            prev.next = tail;
        }
        else {
            tail = new Node(item, null);
            first = tail;
        }
        N++;
    }

    public boolean remove(T item) {
        if (isEmpty()) { throw new IllegalStateException("Cannot remove() from and empty list."); }
        boolean result = false;
        Node prev = first;
        Node curr = first;
        while (curr.next != null || curr == last) {
            if (curr.data.equals(item)) {
                // remove the last remaining element
                if (N == 1) { first = null; last = null; }
                // remove first element
                else if (curr.equals(first)) { first = first.next; }
                // remove last element
                else if (curr.equals(last)) { last = prev; last.next = null; }
                // remove element
                else { prev.next = curr.next; }
                N--;
                result = true;
                break;
            }
            prev = curr;
            curr = prev.next;
        }
        return result;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    private class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Iterator<T> iterator() { return new LinkedListIterator(); }

    private class LinkedListIterator implements Iterator<T> {
        private Node current = first;

        public T next() {
            if (!hasNext()) { throw new NoSuchElementException(); }
            T item = current.data;
            current = current.next;
            return item;
        }

        public boolean hasNext() { return current != null; }

        public void remove() { throw new UnsupportedOperationException(); }
    }

    @Override public String toString() {
        StringBuilder s = new StringBuilder();
        for (T item : this)
            s.append(item + " ");
        return s.toString();
    }

   
}