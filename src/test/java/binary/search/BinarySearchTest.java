package binary.search;

import org.junit.Test;


import static junit.framework.TestCase.assertEquals;
import static serch.Array.binarySearch;

/**
 * Created by vdruzhinin on 4/7/2017.
 */
public class BinarySearchTest {

    @Test
    public void test() {
        assertEquals(0, binarySearch(new int[]{1,2,3,4,5}, 0, 5, 1));
    }
}
