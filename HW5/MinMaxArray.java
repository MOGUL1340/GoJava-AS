package HW5;

import java.util.Arrays;
import java.util.Random;

public class MinMaxArray {

    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println("Начальный массив");
        System.out.println(Arrays.toString(array));
        System.out.println("Массив сортированный методом вставки");
        System.out.println(Arrays.toString(ArraySort.sortMyArray()));
    }

    public static int[] createArray() {
        int[] massive = new int[5];
        Random random = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(50);
        }
        return massive;
    }


    public static void minMaxArray () {
        int[] minMax = createArray();
        int minimum = minMax[0];
        int maximum = minMax[0];
        for (int i = 0; i < minMax.length; i++) {
            if (minimum > minMax[i])
                minimum = minMax[i];
        }

       for (int i = 0; i < minMax.length; i++) {
            if (maximum < minMax[i])
                maximum = minMax[i];
        }
        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);
    }
}
