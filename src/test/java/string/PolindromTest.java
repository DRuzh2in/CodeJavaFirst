package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vdruzhinin on 4/14/2017.
 */
public class PolindromTest {
    @Test
    public void test() {
        assertEquals(true,Polindrom.serchPolindrom("qwq"));
        assertEquals(false,Polindrom.serchPolindrom("qwe"));

    }
}
