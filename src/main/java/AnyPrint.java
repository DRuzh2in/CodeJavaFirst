/**
 * Created by vdruzhinin on 4/6/2017.
 * Any print
 */
public class AnyPrint {

        public static int printArray(int[] arrayInt, int sizeArray) {
            System.out.print("Random array:\n");
            for (int i = 0; i < sizeArray; i++) {
                System.out.format("Arr[%d] = %d\n", i, arrayInt[i] );
            }
            return 0;
        }

}
