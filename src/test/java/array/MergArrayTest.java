package array;

import org.junit.Test;

import static array.Array.mergArray;
import static org.junit.Assert.assertEquals;

/**
 * Created by vdruzhinin on 4/13/2017.
 */
public class MergArrayTest {

    @Test
    public void test() {
        assertEquals( 3,   mergArray (new int[] { 1, 3, 5, 7, 9 }, new int[] { 1, 3, 5, 7, 9 }));


    }
}
