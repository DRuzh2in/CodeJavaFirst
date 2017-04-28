package string;

/**
 * Created by Macintosh on 16.04.17.
 */
public class StringBrackets {
    public static boolean correctBracketPosition (String str){
        int bracket = 0;
        for (char anyChar: str.toCharArray()){
            if (anyChar == '('){
                bracket++;
            }else if(anyChar == ')'){
                bracket--;
            }
            if (bracket < 0){
                return false;
            }
        }
        return bracket == 0;
    }
}
