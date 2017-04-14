package string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by vdruzhinin on 4/14/2017.
 */
public class InStringTest {
    @Test
    public void test() {
        assertEquals(-1, Instring.stringInString("qwerty", "qver"));
//        assertEquals(0, Instring.stringInString("qwerty", "qwe"));
//        assertEquals(3, Instring.stringInString("qwerty", "rty"));
//        assertEquals(5, Instring.stringInString("qwerty", "y"));
//        assertEquals(-1, Instring.stringInString("qwerty", "qwt"));
//        assertEquals(6, Instring.stringInString("qwertyqwt", "qwt"));
        assertEquals(-1, Instring.stringInString("qwertyqwt", "qae"));
    }

}
