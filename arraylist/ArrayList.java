package arraylist;

import java.util.Arrays;

public class ArrayList<T> {

    private Object[] list;

    private int size;

    private final int INITIAL_LENGTH = 10;

    private final int GROWTH_FACTOR = 2;

    public ArrayList() {
        this.list = new Object[INITIAL_LENGTH];
        this.size = 0;
    }

    public void add(T element) {

        if(size == list.length) {
            list = this.resize();
            list[size] = element;
            size++;
        }else if(list[size] == null) {
            list[size] = element;
            size++;
        }
    }

    public boolean delete(int index) {
        if(index > size || list[index] == null) {
            return false;
        }

        list[index] = null;
        this.moveArrayToLeft(index);
        return true;
    }

    public boolean delete(T element) {
        for(int i=0; i < size;i++) {
            if(list[i] == element) {
                list[i] = null;
                this.moveArrayToLeft(i);
                return true;
            }
        }

        return false;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if(index > size) {
            return null;
        }

        return (T) list[index];
    }

    public void set(int index, T element) {
        if(index <= size) {
            list[index] = element;
        }
    }

    public void clear() {
        for(int i=0; i < size;i++) {
            list[i] = null;
        }
    }

    public Object[] toArray() {
        Object[] arr = new Object[size];
        for(int i=0; i < size;i++) {
            arr[i] = list[i];
        }

        return arr;
    }

    private void moveArrayToLeft(int index) {
        for(int i=index; i < size;i++) {
            list[i] = list[i+1];
        }
    }

    private Object[] resize() {
        Object[] newArr = new Object[list.length * GROWTH_FACTOR];

        for(int i=0; i < list.length;i++) {
            newArr[i] = list[i];
        }

        return newArr;
    }

    @Override
    public String toString() {
        return "ArrayList [list=" + Arrays.toString(list) + "]";
    }
}