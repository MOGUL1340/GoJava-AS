package HW5;

import java.util.Random;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] massive = new int[5];
        Random random = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(50);
        }
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i] + " ");
        }
        int minimum = massive[0];
        int maximum = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (minimum > massive[i])
                minimum = massive[i];
        }
        for (int i = 0; i < massive.length; i++) {
            if (maximum < massive[i])
                maximum = massive[i];
        }
        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);
    }
}
