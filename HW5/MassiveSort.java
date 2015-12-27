package HW5;

import java.util.Random;

public class MassiveSort {
    public static void main(String[] args) {
        int[] massive = new int[10];
        Random random = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(50);
        }
        for (int i = 0; i < massive.length; i++) {
            int minElem = massive[i];
            int i_minElem = i;

            for (int j = i; j < massive.length; j++) {

                if (massive[j] < minElem) {
                    minElem = massive[j];
                    i_minElem = j;
                }
            }
            if (i != i_minElem) {
                int temp = massive[i];
                massive[i] = massive[i_minElem];
                massive[i_minElem] = temp;
            }
            System.out.println(massive[i] + " ");
        }
    }
}
