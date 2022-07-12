package lesson1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Создать свою реализацию List - (Number list). Она может работать только с Numbers (Generics)
//Особенности переопределения методов
//1. Метод add - который добавляет в начало массива
//2. Метод remove - удаляет все элементы массива
//3. Метод contains - возвращает true, только если таких элементов больше или равно 2
//
//Особенности новых методов
//1. Метод getDouble(int index), будет возвращать элемент типа Double по указанному индексу, или кидать ошибку
//2. Метод sumIntegers(), будет давать сумму всех чисел, если array - Integer, иначе кидать ошибку

//Опциально(По желанию)
//Закончить MyList класс - дописать оставшиешься методы, кроме итератор и toArray()

public class NumberList<T extends Number> implements List<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public NumberList() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(T num) {
        grow();
        size++;
        array[array.length - size] = num;
        return true;
    }

    public void grow() {
        if(array.length == size) {
            Object[] newArray = new Object[(int) (array.length * 1.5)];
            int differenceLength = newArray.length - array.length;
            System.arraycopy(array, 0, newArray, differenceLength, size);
            array = newArray;
        }
    }

    @Override
    public boolean remove(Object o) {
        return false;
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
        return size;
    }

    @Override
    public String toString() {
        Stream<String> stringStream = Arrays.stream(array).map(String::valueOf);
        String data = "[" + stringStream.collect(Collectors.joining(", ")) + "]";
        String result = data.replaceAll("null, ", "");

        return "NumberList{" +
                "array=" + result +
                '}';
    }

    @Override
    public boolean isEmpty() {
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
    public void clear() {

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
    public void add(int index, T element) {

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
