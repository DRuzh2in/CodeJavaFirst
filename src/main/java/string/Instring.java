package string;

/**
 * Created by vdruzhinin on 4/14/2017.
 */
public class Instring {
    public static int stringInString(String str, String inStr) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == inStr.charAt(0)) {
                for (int j = 0, n = i; j < inStr.length(); j++, n++) {
                    if (str.charAt(n) != inStr.charAt(j)) {
                        return -1;
                    }
                }
                return i;
            }
        }
        return -1;
    }
}
