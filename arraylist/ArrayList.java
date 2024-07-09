package arraylist;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class ArrayList<T> {

    private T[] list;

    private int size;

    private final int INITIAL_LENGTH = 10;

    private final double GROWTH_FACTOR = 1.5;

    public ArrayList() {
        this.list = (T[]) new Object[INITIAL_LENGTH];
        this.size = 0;
    }

    public void add(T element) {

        if (size == list.length) {
            this.resize();
            list[size] = element;
            size++;
        } else if (list[size] == null) {
            list[size] = element;
            size++;
        }
    }

    public T deleteAt(int index) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException();
        }

        T element = list[index];
        list[index] = null;
        size--;
        this.moveArrayToLeft(index);
        return element;
    }

    public T delete(T element) {
        T deleted = null;
        for (int i = 0; i < size; i++) {
            if (list[i] == element) {
                deleted = list[i];
                list[i] = null;
                size--;
                this.moveArrayToLeft(i);
            }
        }

        return deleted;
    }

    public T get(int index) {
        if (index > size) {
            return null;
        }

        return (T) list[index];
    }

    public void set(int index, T element) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException();
        }
        list[index] = element;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
        size = 0;
    }

    public Object[] toArray() {
        Object[] arr = new Object[size];
        for (int i = 0; i < size; i++) {
            arr[i] = list[i];
        }

        return arr;
    }

    public int size() {
        return size;
    }

    private void moveArrayToLeft(int index) {
        for (int i = index; i < size; i++) {
            T temp = list[i + 1];
            list[i + 1] = list[i];
            list[i] = temp;
        }
    }

    private void resize() {
        T[] newArr = (T[]) new Object[(int)(list.length * GROWTH_FACTOR)];

        for (int i = 0; i < list.length; i++) {
            newArr[i] = list[i];
        }

        list = newArr;
    }

    @Override
    public String toString() {
        return "ArrayList " + Arrays.toString(list);
    }
}