package string;

public class Polindrom {
    public static boolean serchPolindrom(String str){
        boolean num = false;
        String revert = string.RevertString.revert(str);
        return str.equals(revert);
    }
}
