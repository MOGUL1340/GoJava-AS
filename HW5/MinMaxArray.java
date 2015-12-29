package HW5;

import java.util.Arrays;

public class MinMaxArray {

    public static void main(String[] args) {

        int[] array = {1, 32, 5, 7, 28};
        ArraySort sortArr = new ArraySort();
        System.out.println("Начальный массив");
        System.out.println(Arrays.toString(array));
        System.out.println("Массив сортированный методом вставки");
        System.out.println(Arrays.toString(ArraySort.sortMyArray(array)));
    }

    public static void minMaxArray (int[] array) {

        int minimum = array[0];
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i])
                minimum = array[i];

            if (maximum < array[i])
                maximum = array[i];
        }
        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);
    }
}
