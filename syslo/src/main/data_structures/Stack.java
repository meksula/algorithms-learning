package data_structures;

/**
 * @Author
 * Karol Meksuła
 * 14-07-2018
 * */

public class Stack<T> {
    private LinkedList<T> linkedList;
    private long size;
    private T last;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }

    public void push(T data) {
        linkedList.insert(data);
        last = data;
        size++;
    }

    public T pop() {
        T currentLast = last;
        linkedList.removeValue(linkedList.lastElement());
        last = linkedList.lastElement();
        size--;
        return currentLast;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public long size() {
        return size;
    }

    public T peek() {
        T current = linkedList.next();

        while (linkedList.hasNext()) {
            current = linkedList.next();
        }

        return current;
    }

}
