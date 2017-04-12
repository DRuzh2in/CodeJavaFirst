package string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by vdruzhinin on 4/12/2017.
 */
public class RevertStringTest {

    @Test
    public void test(){
        assertEquals("ytrewq", RevertString.revert("qwerty"));
    }

}
