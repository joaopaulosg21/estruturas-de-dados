package stack;

import java.util.Arrays;

public class Stack<T> {

    private Object[] stack;

    private int count;

    private final int INITIAL_LENGTH = 10;

    public Stack() {
        this.stack = new Object[INITIAL_LENGTH];
        this.count = 0;
    }

    public void push(T element) {
        
        if(count != INITIAL_LENGTH) {
            stack[count] = element;
            count++;
        }
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        T element = null;

        if(count > 0) {
            element = (T) stack[count-1];
            stack[count-1] = null;
            count--;
        }

        return element;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if(count > 0) {
            return (T) stack[count-1];
        }

        return null;
    }

    public boolean contains(T element) {
        for(Object obj : stack) {
            if(obj == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Stack [stack=" + Arrays.toString(stack) + "]";
    }

    
}