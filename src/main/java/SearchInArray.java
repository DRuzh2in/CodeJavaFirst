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
}
