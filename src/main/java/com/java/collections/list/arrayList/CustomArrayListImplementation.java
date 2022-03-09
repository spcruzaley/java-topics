package com.java.collections.list.arrayList;

import java.util.Arrays;

public class CustomArrayListImplementation<T> {

    private T[] elements;
    private int size;

    public CustomArrayListImplementation() {
        elements = (T[]) new Object[5];
    }

    public T get(int index) {
        if(index < size) {
            return elements[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(T element) {
        //We can set the default size as per our necessities
        if(elements.length - size <= 5) {
            increaseSize();
        }
        elements[size++] = element;
    }

    public T remove(int index) {
        if(index < size) {
            T element = elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i+1];
            }
            elements[size] = null;
            size--;

            return element;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size() {
        return size;
    }

    private void increaseSize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

}
