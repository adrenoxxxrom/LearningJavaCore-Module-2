package lesson1;

public class Main {
    public static void main(String[] args) {

        //1. Метод add - который добавляет в начало массива

        NumberList<Integer> ints = new NumberList<>();
        for (int i = 1; i <= 32; i++) {
            ints.addReverseOrder(i);
        }

        System.out.println("Reverse order list: " + ints);

        boolean contains = ints.contains(1);
        boolean contains2 = ints.contains(1024);

        System.out.println("Число 1 содержится - "
                + contains + ", "
                + "Число 1024 содержится - "
                + contains2
                + "\n");

        //2. Метод containsCustom() - возвращает true, только если таких элементов больше или равно 2
        //2.1. Метод counter() - возвращает int - сколько раз объект встречается в массиве

        NumberList<Number> containsTestList = new NumberList<>();

        containsTestList.add(1);
        containsTestList.add(2);
        containsTestList.add(1);
        containsTestList.add(3);
        containsTestList.add(1);
        containsTestList.add(25);

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
                + j + " раз"
                + "\n");


        //3. Метод remove - удаляет все элементы массива

        NumberList<Number> integers = new NumberList<>();

        integers.add(99);
        integers.add(88888.0);
        integers.add(99);
        integers.add(88888);
        integers.add(99);
        integers.add(88888);

        System.out.println(integers);
        integers.removeObj(99);
        System.out.println("Все числа 99 удалены");
        System.out.println(integers + "\n");


        //4. Метод getDouble(int index), будет возвращать элемент типа Double по указанному индексу,
        //или кидать ошибку

        NumberList<Number> doublesList = new NumberList<>();

        doublesList.addReverseOrder(11.5);
        doublesList.addReverseOrder(13.5);
        doublesList.addReverseOrder(18.5);
        doublesList.addReverseOrder(56);


        System.out.println("Index 1: " + doublesList.getDouble(1));
        System.out.println("Index 3: " + doublesList.getDouble(3));
        System.out.println();


        //throws NumberFormatException
        //System.out.println(doublesList.getDouble(0));

        //5. Метод sumIntegers(), будет давать сумму всех чисел, если array - Integer, иначе кидать ошибку

        //throws NumberFormatException
        //System.out.println(doublesList.sumIntegers());

        NumberList<Number> intsSumList = new NumberList<>();

        intsSumList.add(2);
        intsSumList.add(2);
        intsSumList.add(2);

        System.out.println("Сумма = " + intsSumList.sumIntegers());





    }
}