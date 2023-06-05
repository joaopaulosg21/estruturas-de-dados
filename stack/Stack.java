package stack;

import java.util.Arrays;

public class Stack<T> {
    private int peek;

    private Object[] stack;

    public Stack() {
        stack = new Object[1];
    }

    public void push(T element) {
        if(stack.length == 0) {
            stack = new Object[1];
        }
        for(int i=stack.length-1;i >=0;i--) {
            if(stack[i] != null) {
                int size = stack.length+1;
                Object[] newArr = Arrays.copyOf(stack,size);
                newArr[size-1] = element;
                stack = newArr;
                peek = stack.length-1;
            }
        }

        stack[stack.length-1] = element;
        peek = stack.length-1;
    }

    public Object pop() {
        if(stack[peek] != null) {
            Object element = stack[peek];
            stack[peek] = null;
            Object[] newArr = Arrays.copyOf(stack,stack.length-1);
            stack = newArr;
            if(stack.length-1 < 0) {
                peek = 0;
            }else{
                peek = stack.length-1;
            }
            return element;
        }

        return null;
    }

    public Object peek() {
        if(stack.length == 0) {
            return null;
        }
        return stack[peek];
    }
}
