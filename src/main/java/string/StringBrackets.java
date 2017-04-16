package string;

/**
 * Created by Macintosh on 16.04.17.
 */
public class StringBrackets {
    public static boolean correctBracketPosition (String str){
        int leftBracket = 0;
        for (char brace: str.toCharArray()){
            if (brace == '('){
                leftBracket++;
            }else if(brace == ')'){
                leftBracket--;
            }
            if (leftBracket < 0){
                return false;
            }
        }
        return leftBracket == 0;
    }
}
