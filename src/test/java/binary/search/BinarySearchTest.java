package binary.search;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;

import static java.util.Arrays.binarySearch;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by vdruzhinin on 4/7/2017.
 */
public class BinarySearchTest {

    @Test
    public void test() {
        assertEquals(0, binarySearch(new int[]{1,2,3,4,5}, 1));
        assertEquals(1, binarySearch(new int[]{1,2,3,4,5}, 2));
        assertEquals(2, binarySearch(new int[]{1,2,3,4,5}, 3));
        assertEquals(3, binarySearch(new int[]{1,2,3,4,5}, 4));
        assertEquals(4, binarySearch(new int[]{1,2,3,4,5}, 5));

        assertEquals(-6, binarySearch(new int[]{1,2,3,4,5,7}, 6));
        assertEquals(-2, binarySearch(new int[]{1,3,4,5,6,7}, 2));
        assertEquals(-4, binarySearch(new int[]{1,2,3,5,6,7}, 4));
        assertEquals(-1, binarySearch(new int[]{1,2,3,4,5,7}, -1));
        assertEquals(-7, binarySearch(new int[]{1,2,3,4,5,7}, 10));

        assertEquals(0, binarySearch(new int[]{1}, 1));
        assertEquals(0, binarySearch(new int[]{1,1}, 1));
        assertEquals(0, binarySearch(new int[]{1,3}, 1));
        assertEquals(1, binarySearch(new int[]{1,3}, 3));

        assertEquals(-1, binarySearch(new int[]{1}, 0));
        assertEquals(-2, binarySearch(new int[]{1}, 2));


        assertEquals(-1, binarySearch(new int[]{1,1}, 0));
        assertEquals(-3, binarySearch(new int[]{1,1}, 2));
        assertEquals(-1, binarySearch(new int[]{1,2}, 0));
        assertEquals(-3, binarySearch(new int[]{1,2}, 3));
        assertEquals(-1, binarySearch(new int[]{}, 3));
        assertEquals(1, binarySearch(new int[]{1,2,3}, 2));
        assertEquals(1, binarySearch(new int[]{1,2,3,4}, 2));
        assertEquals(2, binarySearch(new int[]{1,2,3,4}, 3));
    }
}
