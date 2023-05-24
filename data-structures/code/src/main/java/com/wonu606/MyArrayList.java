package com.wonu606;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

    private int size;
    private T[] array;

    public MyArrayList() {
        array = (T[]) new Object[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object target) {
        return indexOf(target) != -1;
    }

    @Override
    public Iterator<T> iterator() {
        T[] copy = Arrays.copyOf(array, size);
        return Arrays.stream(copy).iterator();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    @Override
    public <U> U[] toArray(U[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(T element) {
        if (isFull()) {
            T[] bigger = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;
        }
        array[size] = element;
        size++;
        return true;
    }

    private boolean isFull() {
        return size == array.length;
    }

    @Override
    public boolean remove(Object target) {
        int index = indexOf(target);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return collection.stream().allMatch(e -> contains(e));
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        boolean flag = true;
        for (T element : collection) {
            flag &= add(element);
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        boolean flag = true;
        for (Object element : collection) {
            flag &= remove(element);
        }
        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        for (int to = size, i = size = 0; i < to; i++) {
            array[i] = null;
        }
    }

    @Override
    public T get(int index) {
        checkIndexBounds(index);
        return array[index];
    }

    private void checkIndexBounds(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public T set(int index, T element) {
        T old = get(index);
        array[index] = element;
        return old;
    }

    @Override
    public void add(int index, T element) {
        checkIndexBounds(index);
        add(element);
        // shift the elements
        for (int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
    }

    @Override
    public T remove(int index) {
        T element = get(index);
        size--;
        System.arraycopy(array, index + 1, array, index, size - index);
        array[size] = null;
        return element;
    }

    @Override
    public int indexOf(Object target) {
        if (target == null) {
            return findNullIndex();
        }

        for (int i = 0; i < size; i++) {
            if (target.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    private int findNullIndex() {
        for (int i = 0; i < size; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object target) {
        if (target == null) {
            return findNullLastIndex();
        }

        for (int i = size - 1; i >= 0; i--) {
            if (target.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    private int findNullLastIndex() {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        T[] copy = Arrays.copyOf(array, size);
        return Arrays.asList(copy).listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        T[] copy = Arrays.copyOf(array, size);
        return Arrays.asList(copy).listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        checkSublistRange(fromIndex, toIndex);
        T[] copy = Arrays.copyOfRange(array, fromIndex, toIndex);
        return Arrays.asList(copy);
    }

    private void checkSublistRange(int fromIndex, int toIndex) {
        checkIndexBounds(fromIndex);
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
    }
}
