package array;

import java.util.Arrays;
import com.sun.deploy.util.ArrayUtil;

/**
 * Created by vdruzhinin on 4/17/2017.
 */
public class RevertArray {
    public static String revert(int [] data){
        int tmp;
        int sizeArr = data.length;
        for (int i = 0; i < sizeArr / 2; i++ ){
            tmp = data[i];
            data[i] = data[sizeArr -i - 1];
            data[sizeArr - i -1] = tmp;
        }

        return Arrays.toString(data);
    }

    public static String libRevert(int [] data){
        revert(data);
        return Arrays.toString(data);
    }
}
