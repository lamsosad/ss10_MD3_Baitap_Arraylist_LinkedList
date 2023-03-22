package bai1_ArrayList;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    private void ensureCapacity() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
//        full size -> tăng độ dài mảng
        if (size == element.length) {
            ensureCapacity();
        }
        element[size++] = e;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) element[index];
    }

    public void add(int index, E e) {
        if (size == element.length) {
            ensureCapacity();
        }
        for (int i = size - 1; i >= index; i--) {
            System.out.println(size);
            element[i + 1] = element[i];
        }
        element[index-1] = e;
    }

    void clear() {
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }
    }

    public Object[] remove(int index) {
        for (int i = index; i < element.length - 1; i++) {
            element[index] = element[i + 1];
        }
        return element;
    }
    public int indexOf(E e){
        for (int i = 0; i < element.length; i++) {
            if (e ==element[i]){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", element=" + Arrays.toString(element) +
                '}';
    }
}
