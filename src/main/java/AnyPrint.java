/**
 * Created by vdruzhinin on 4/6/2017.
 * Any print
 */
public class AnyPrint {

    /***Print array***/
    public static void printArray(int[] arrayInt, int sizeArray, int key) {
        System.out.print("Array:\n");
        for (int i = 0; i < sizeArray; i++) {
            switch (key)
            {
                case 1:  System.out.format("Arr[%d] = %d\n", i, arrayInt[i]);
                    break;
                case 2:  System.out.format("Arr[%d] = %c\n", i, arrayInt[i]);
                    break;
                case 3:  System.out.format("Arr[%d] = %f\n", i, arrayInt[i]);
                    break;
                case 4:  System.out.format("Arr[%d] = %d\n", i, arrayInt[i]);
                    break;
                default: System.out.format("WTF, where Key\n!!!");
                    break;
            }
        }
    }
}
