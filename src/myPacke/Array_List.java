package myPacke;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_List<E> {
    private int size = 0;
    private static final int CAPACITY = 10;
    private Object element[];

    public Array_List() {
        element = new Object[CAPACITY];
    }

    private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        } else {
            element[size++] = e;
        }
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        } else {
            return (E) element[i];
        }
    }
}
