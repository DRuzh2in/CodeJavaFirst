/**
 * Created by vdruzhinin on 4/7/2017.
 */
public class SortArray {

    //Insertion sort
    public static int[] InsertSort(int[] arrayInt, int sizeArr) {
        for (int i = 0; i < sizeArr; i++) {
            int min = i;
            for (int j = i + 1; j < sizeArr; j++) {
                if (arrayInt[min] > arrayInt[j]) {
                    min = j;
                }
            }
            if (i != min) {
                int c = arrayInt[i];
                arrayInt[i] = arrayInt[min];
                arrayInt[min] = c;
            }
        }
        return arrayInt;
    }

}
