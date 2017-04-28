package array;

import java.util.Random;

/**
 * Created by vdruzhinin on 4/6/2017.
 * Correction of spelling errors in intellij idea
 */
public class GetArray {

    //Random digit
    public static int randomiser(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    //MergArray with random digits
    public static int[] getRandomArray(int sizeArray, int min, int max) {
        int[] randomArray = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            randomArray[i] = randomiser(min, max);
        }
        return randomArray;
    }

    //MergArray sorted in ascending order
    public static int[] getSortArray(int sizeArray) {
        int[] sortArray = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++)
            sortArray[i] = i;
        return sortArray;
    }
}
