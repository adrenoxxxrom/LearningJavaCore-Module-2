package lesson1;

import java.util.*;

public class NumberList<T extends Number> implements List<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public NumberList() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    //начало домашнего задания

    public boolean addReverseOrder(T num) {
        if (array.length >= size) {
            grow();
            Object[] elementToOffset = Arrays.copyOfRange(array, 0, array.length - 1);
            System.arraycopy(elementToOffset, 0, array, 1, elementToOffset.length);
            array[0] = num;
            size++;

        }
        return true;
    }

    @Override
    public boolean contains(Object num) {
        for (Object obj : array) {
            if (num.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsCustom(Object num) {
        int counter = 0;
        for (Object obj : array) {
            if (num.equals(obj)) {
                counter++;
                if (counter >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeObj(Object o) {
        boolean result = false;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (o.equals(array[i])) {
                result = true;
                array[i] = null;
                size--;
            } else if (array[i] != null) {
                count++;
            }
        }

        Object[] tmp = new Object[count];
        for (int i = 0, c = 0; i < array.length; i++) {
            if (array[i] != null) {
                tmp[c] = array[i];
                c++;
            }
        }
        array = tmp;
        return result;
    }

    public Object getDouble(int index) {
        if (array[index] instanceof Double) {
            return array[index];
        } else {
            throw new NumberFormatException("Число "
                    + array[index]
                    + " с индексом "
                    + index
                    + " не является Double");

        }
    }

    public Integer sumIntegers() {
        int sum = 0;

        for (Object o : array) {
            if (o instanceof Integer) {
                sum = sum + (int) o;
            } else throw new NumberFormatException("Err: not an Integer");
        }
        return sum;
    }

    //конец домашнего задания

    @Override
    public boolean add(T num) {
        if (array.length >= size) {
            grow();
            array[size] = num;
            size++;
        }
        return true;
    }

    @Override
    public void add(int index, T num) {
        array[index] = num;

    }

    public void grow() {
        array = Arrays.copyOf(array, size + 1);

    }

    public int counter(Object num) {
        int counter = 0;
        for (Object obj : array) {
            if (num.equals(obj)) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public int size() {
        System.out.println(size);
        return size;
    }

    @Override
    public String toString() {


        return "NumberList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            array[i] = null;
        size = 0;
    }

    public void printArrayInfo(String s) {

        System.out.println("\n" + s + "\n"
                + "Array:" + Arrays.toString(array) + "\n"
                + "Array length: " + array.length + "\n"
                + "List size: " + size);


    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }


    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }


    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }


}
