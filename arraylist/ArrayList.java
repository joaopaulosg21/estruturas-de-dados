package arraylist;

import java.util.Arrays;

public class ArrayList<T> {
    Object[] arr;

    private int size = 10;

    public ArrayList() {
        arr = new Object[size];
    }

    public ArrayList(int size) {
        this.size = size;
        arr = new Object[size];
    }

    public void add(T element) {
        if(arr[arr.length-1] != null) {
            int newSize = size+1;
            Object[] newArr = Arrays.copyOf(arr, newSize);
            newArr[size] = element;
            arr = newArr;
            size = newSize;
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == null) {
                arr[i] = element;
                break;
            }
        }
    }

    public boolean remove(int index) {
        if(index > arr.length || index < arr.length || arr[index] == null) {
            return false;
        }
        arr[index] = null;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] == null & arr[i+1] != null) {
                arr[i] = arr[i+1];
                arr[i+1] = null;
            } 
        }
        return true;
    }

    public Object get(int index) {
        try{
            return arr[index];
        }catch(ArrayIndexOutOfBoundsException exc) {
            return null;
        }
    }

    public Object set(T element, int index) {
        try{
            arr[index] = element;
            return element;
        }catch(ArrayIndexOutOfBoundsException exc) {
            return null;
        }
    }

    public void clear() {
        this.size = 10;
        arr = new Object[size];
    }
    
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String result = "[";
        for(Object o : arr) {
            result+= (o+",");
        }
        result = result.substring(0,result.length()-1) + "]";
        return result;
    }
}
