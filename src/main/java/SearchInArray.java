/**
 * Created by vdruzhinin on 4/6/2017.
 * Search maximum in array
 */
public class SearchInArray {

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

    public static int binarySearch(int[] arrayInt, int left, int right, int search){
        int mid;
        if (left > right)
            return -1;
        mid = (left + right)/2;
        if (arrayInt[mid] == search)
            return mid;
        if (search < arrayInt[mid])
            return binarySearch(arrayInt, left , mid-1, search);
        else
            return binarySearch(arrayInt, mid, right-1, search);
    }
}
