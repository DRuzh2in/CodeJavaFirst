package string;

/**
 * Created by vdruzhinin on 4/14/2017.
 */
public class Polindrom {
    public static boolean serchPolindrom( String str){
        boolean num = false;
        String revert = string.RevertString.revert(str);

        return str.equals(revert);
    }
}
