package lesson1;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1. Метод add - который добавляет в начало массива

        NumberList<Integer> ints = new NumberList<>();
        for (int i = 1; i <= 3 ; i++) {
            ints.add(i);
        }

        System.out.println(ints);

        boolean contains = ints.contains(1);
        boolean contains2 = ints.contains(1024);

        System.out.println("Число 1 содержится - "
                + contains + ", "
                + "Число 1024 содержится - "
                + contains2);

        //2. Метод containsCustom() - возвращает true, только если таких элементов больше или равно 2
        //2.1. Метод counter() - возвращает int - сколько раз объект встречается в массиве

        NumberList<Number> containsTestList = new NumberList<>();

        containsTestList.add(1);
        containsTestList.add(1);
        containsTestList.add(1);
        containsTestList.add(999);

        System.out.println(containsTestList);

        boolean b = containsTestList.containsCustom(1);
        boolean c = containsTestList.containsCustom(999);
        int i = containsTestList.counter(1);
        int j = containsTestList.counter(999);

        System.out.println("Число 1 содержится больше 2х раз - "
                + b + ", "
                + "Число 999 содержится больше или 2 раза  - "
                + c);



        System.out.println("Число 1 повторяется - "
                + i + " раз(а), "
                + "Число 999 повторяется - "
                + j + " раз ");

    }
}