package data_structures;

import java.util.Iterator;

/**
 * @Author
 * Karol Meksuła
 * 13-07-2018
 * */

public class LinkedList<T> implements Iterable<T>, Iterator<T> {
    private Box head;
    private Box current;
    private int counter;
    private boolean flag = true;

    public void insert(T element) {
        if (head == null) {
            head = new Box(element);
            return;
        }

        Box current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Box(element);
        counter++;
    }

    public void insertBefore(T element) {
        Box updatedHead = new Box(element);
        updatedHead.next = head;
        head = updatedHead;
    }

    public void removeValue(T element) {
        if (head == null) {
            return;
        }

        if (element.equals(head)) {
            head = head.next;
            counter--;
            return;
        }

        Box current = head;

        while (current.next != null) {
            if (current.next.element.equals(element)) {
                current.next = current.next.next;
                counter--;
                return;
            }
            current = current.next;
        }

    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return counter + 1;
    }

    public T lastElement() {
        Box current;

        if (head == null) {
            return null;
        }

        current = head;

        while (current.next != null) {
            current = current.next;
        }

        return current.element;
    }

    @Override
    public Iterator<T> iterator() {
        flag = true;
        return this;
    }

    @Override
    public boolean hasNext() {
        return flag;
    }

    @Override
    public T next() {
        if (current == null) {
            current = head;
        }

        T toReturn = current.element;
        current = current.next;

        if (current == null) {
            this.flag = false;
        }

        return toReturn;
    }

    private class Box {
        Box next;
        T element;

        Box(T element) {
            this.element = element;
        }

    }

}

