package queue;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Queue<T> {
    private T[] queue;

    private int head;

    private int tail;

    private int count;

    private final int INITIAL_LENGTH = 10;

    public Queue() {
        this.queue = (T[]) new Object[INITIAL_LENGTH];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    public void enqueue(T element) {
        if (tail == INITIAL_LENGTH && head == INITIAL_LENGTH) {
            tail = 0;
            head = 0;
        }
        if (count != INITIAL_LENGTH) {
            queue[tail] = element;
            tail++;
            count++;
        }
    }

    public T dequeue() {
        T element = null;

        if (head != tail) {
            element = queue[head];
            queue[head] = null;
            head++;
            count--;
        }

        return element;
    }

    @Override
    public String toString() {
        return "Queue [queue=" + Arrays.toString(queue) + "]";
    }

}