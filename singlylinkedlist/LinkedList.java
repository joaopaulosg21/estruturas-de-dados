package singlylinkedlist;

public class LinkedList<T> {

    private Node<T> head;

    private int size;

    private Node<T> tail;

    public void add(T value) {
        Node<T> node = new Node<>(value);

        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public T get(int index) {
        if (index >= size || index < 0)
            throw new IllegalArgumentException();

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getValue();
    }

    public void insertAt(int index, T value) {
        Node<T> newNode = new Node<>(value);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<T> previous = this.getNode(index - 1);
            Node<T> next = previous.getNext();
            previous.setNext(newNode);
            newNode.setNext(next);
        }
        size++;
    }

    public T removeAt(int index) {
        T element = null;
        if (index == 0) {
            element = head.getValue();
            head = this.getNode(index + 1);
        } else {
            Node<T> previous = this.getNode(index - 1);
            Node<T> next = this.getNode(index + 1);
            element = previous.getNext().getValue();
            previous.setNext(next);
        }
        size--;
        return element;
    }

    private Node<T> getNode(int index) {
        if (index >= size || index < 0)
            throw new IllegalArgumentException();

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getValue() + ",");
            current = current.getNext();
        }

        return sb.toString().substring(0, sb.length() - 1) + "]";
    }
}
