package serch;

/**
 * Created by vdruzhinin on 4/6/2017. Search elements in Array
 */
public class Array {

    //Search maximum in Array
    public static int serchMax(int[] arrayInt, int sizeArr) {
        int returnMax = 0;
        for (int i = 0; i < sizeArr; i++) {
            int max = i;
            for (int j = i + 1; j < sizeArr; j++) {
                if (arrayInt[max] < arrayInt[j]) {
                    max = j;
                }
            }
            returnMax = max;
        }
        return returnMax;
    }

    //Binary search
    public static int binarySearch(int[] arrayInt, int left, int right, int search) {
        int middle;
        if (left >= right) {
            return -1;
        }
        middle = (left + right) / 2;
        if (arrayInt[middle] == search) {
            return middle;
        }

        if (search < arrayInt[middle]) {
            return binarySearch(arrayInt, left, middle -1, search);
        } else
            return binarySearch(arrayInt, middle, right +1, search);
    }
}
