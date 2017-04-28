package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vdruzhinin on 4/17/2017.
 */
public class RevertArrayTest {
    @Test
    public void test() {
        assertEquals("[5, 4, 3, 2, 1]", RevertArray.revert(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test2() {
        assertEquals("[5, 4, 3, 2, 1]", RevertArray.libRevert(new int[]{1,2,3,4,5}));
    }
}
