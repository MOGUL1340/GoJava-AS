package HW5;

public class ArraySort {

    public static int[] sortMyArray() {
        int[] myOwnSort = MinMaxArray.createArray();

        for (int i = 0; i < myOwnSort.length; i++) {
            int minElem = myOwnSort[i];
            int i_minElem = i;

            for (int j = i; j < myOwnSort.length; j++) {
                if (myOwnSort[j] < minElem) {
                    minElem = myOwnSort[j];
                    i_minElem = j;
                }
            }
            if (i != i_minElem) {
                int temp = myOwnSort[i];
                myOwnSort[i] = myOwnSort[i_minElem];
                myOwnSort[i_minElem] = temp;
            }
        }
        return myOwnSort;
    }
}
