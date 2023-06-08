package queue;

import java.util.Arrays;

public class Queue<T> {
    
    private int head;

    private int tail;

    private Object[] arr;

    public Queue() {
        arr = new Object[1];
        head = 0;
        tail = 0;
    }

    public void enqueue(T element) {
        if(arr.length == 0) {
            arr = new Object[1];
            head = 0;
            tail = 0;
        }
        if(arr[head] != null) {
            int size = arr.length + 1;
            Object[] newArr = Arrays.copyOf(arr,size);
            tail = newArr.length-1;
            newArr[tail] = element;
            arr = newArr;
        }
        arr[tail] = element;
    }

    public Object dequeue() {
        if(arr.length == 0) {
            arr = new Object[1];
            head = 0;
            tail = 0;
            return null;
        }
        int size = arr.length-1;
        Object element = arr[head];
        arr[head] = null;
        Object[] newArr = new Object[size];
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != null) {
                newArr[i-1] = arr[i];
            }
        }
        arr = newArr;
        return element;
    }

    @Override
    public String toString() {
        String result = "[";
        for(Object obj : arr) {
            result += " " + obj + ",";
        }
        result = result.substring(0,result.length()-1) + " ]";
        return result;
    }
}
