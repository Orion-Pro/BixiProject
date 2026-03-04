package Model.linkedList;

public class LinkedList<T> implements List<T> {

    private class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        public Node(T item) {
            data = item;
            next = null;
        }
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int n;

    @Override
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        n++;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public T pop() {
        Node<T> removed = tail;
        tail = null;
        tail = removed.prev;
        n--;
        return removed.data;
    }

    @Override
    public int size() {return n;}




}
