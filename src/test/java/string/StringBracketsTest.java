package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Macintosh on 16.04.17.
 */
public class StringBracketsTest {
    @Test
    public void test(){
        assertEquals(true, StringBrackets.correctBracketPosition("(qwerty)"));
        assertEquals(false, StringBrackets.correctBracketPosition("(qwerty))"));
        assertEquals(true, StringBrackets.correctBracketPosition("(qwe(rty))"));
        assertEquals(false, StringBrackets.correctBracketPosition("(qw(e(rty))"));
    }
}
