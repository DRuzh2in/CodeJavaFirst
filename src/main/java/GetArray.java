import java.util.Random;

/**
 * Created by vdruzhinin on 4/6/2017.
 * Correction of spelling errors in intellij idea
 */
public class GetArray {

    public static int randomiser(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int[] getRandomArray(int min, int max, int sizeArray) {

        final int [] randomArray = new int[sizeArray] ;
        for (int i = 0; i < sizeArray; i++) {
            randomArray[i] = randomiser(min, max);
            }
            return randomArray;
        }


}
