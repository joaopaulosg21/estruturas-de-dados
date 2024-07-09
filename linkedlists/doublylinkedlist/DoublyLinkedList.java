package linkedlists.doublylinkedlist;

public class DoublyLinkedList<T> {

    private Node<T> head;

    private Node<T> tail;

    private int size;

    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            Node<T> temp = tail;
            tail.setNext(newNode);
            tail = newNode;
            tail.setPrevious(temp);
        }
        size++;
    }

    public T remove(T element) {
        T data = null;

        if (head.getValue().equals(element) && head.getNext() == null) {
            data = head.getValue();
            head = null;
            tail = null;
        } else if (head.getValue().equals(element)) {
            data = this.removeHead();
        } else if (tail.getValue().equals(element)) {
            data = this.removeTail();
        } else {
            for (Node<T> current = head; current.getNext() != null; current = current.getNext()) {
                if (current.getValue().equals(element)) {
                    data = current.getValue();
                    Node<T> prev = current.getPrevious();
                    Node<T> next = current.getNext();

                    prev.setNext(next);
                    next.setPrevious(prev);
                }
            }
            size--;
        }

        return data;
    }

    public T get(int index) {

        if(index >= size || index < 0) throw new IllegalArgumentException();

        Node<T> current = head;
        for(int i=0;i < index;i++) {
            current = current.getNext();
        }

        return current.getValue();
    }

    private T removeHead() {
        T data = head.getValue();
        head.getNext().setPrevious(null);
        head = head.getNext();
        size--;

        return data;
    }

    private T removeTail() {
        T data = tail.getValue();
        tail.getPrevious().setNext(null);
        tail = tail.getPrevious();
        size--;

        return data;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        var current = head;
        while (current != null) {
            sb.append(current.getValue()).append(",");
            current = current.getNext();
        }
        return sb.toString().substring(0, sb.length() - 1) + "]";
    }
}
