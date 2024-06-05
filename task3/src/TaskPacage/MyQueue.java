package TaskPacage;

public class MyQueue<E> implements NullQueue<E>{
    private Node head;
    private Node tail;
    int size = 0;

    @Override
    public boolean isEmpty() {return  tail == null;}

    @Override
    public boolean add(E e) {
        if (head == null) {
            head = new Node(e, null);
            tail = head;
        } else {
            head.next = new Node(e, null);
            head = head.next;
        }
        size++;
        return true;
    }

    @Override
    public E remove() {
        E el = tail.value;
        tail = tail.next;
        size--;
        return el;
    }

    @Override
    public E element() {
        return head.value;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        Node next;
        E value;

        private Node(E value, Node next) {
            this.next = next;
            this.value = value;
        }
    }
}
