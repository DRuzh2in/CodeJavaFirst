package array;

/**
 * Created by vdruzhinin on 4/13/2017.
 */
public class MergArray {

    public static int[] merge(int[] arrayA, int[] arrayB) {
        int[] arrayC = new int[100];
        boolean flag = false;

        for (int i = 0, k = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayB[j] == arrayA[i]) {
                    flag = true;
                    for (int n = 0; n < k; n++) {
                        if (arrayC[n] == arrayA[i]) {
                            flag = false;
                        }
                    }
                }
            }
            if (flag) {
                arrayC[k++] = arrayA[i];
            }
        }
        return arrayC;
    }
}