package HW5;

public class ArraySort {

    public static int[] sortMyArray(int[] arrayFromOtherMethod) {
        arrayFromOtherMethod = MinMaxArray.createArray();
        int[] newSort = arrayFromOtherMethod;
        for (int i = 0; i < newSort.length; i++) {
            int minElem = newSort[i];
            int i_minElem = i;

            for (int j = i; j < newSort.length; j++) {
                if (newSort[j] < minElem) {
                    minElem = newSort[j];
                    i_minElem = j;
                }
            }
            if (i != i_minElem) {
                int temp = newSort[i];
                newSort[i] = newSort[i_minElem];
                newSort[i_minElem] = temp;
            }
        }
        return newSort;
    }
}
