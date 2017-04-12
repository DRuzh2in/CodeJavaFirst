package string;

/**
 * Created by vdruzhinin on 4/12/2017.
 */
public class RevertString {

    public static String revert (String str){
        StringBuilder string = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--){
            string.append(str.charAt(i));
        }
        return string.toString();
    }
}
