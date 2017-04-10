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
        assertEquals(1, binarySearch(new int[]{1,2,3,4,5}, 0, 5, 2));
        assertEquals(2, binarySearch(new int[]{1,2,3,4,5}, 0, 5, 3));
        assertEquals(3, binarySearch(new int[]{1,2,3,4,5}, 0, 5, 4));
        assertEquals(4, binarySearch(new int[]{1,2,3,4,5}, 0, 5, 5));
        assertEquals(-1, binarySearch(new int[]{1,2,3,4,5,7}, 0, 6, 6));
        assertEquals(-1, binarySearch(new int[]{1,3,4,5,6,7}, 0, 6, 2));
        assertEquals(-1, binarySearch(new int[]{1,2,3,5,6,7}, 0, 6, -1));
//        assertEquals(-1, binarySearch(new int[]{1,2,3,5,6,7}, 0, 6, 10));
        assertEquals(0, binarySearch(new int[]{1}, 0, 1, 1));
        assertEquals(1, binarySearch(new int[]{1,1}, 0, 2, 1));
        assertEquals(1, binarySearch(new int[]{1,3}, 0, 2, 3));
//        assertEquals(0, binarySearch(new int[]{3,1}, 0, 2, 3));
        assertEquals(-1, binarySearch(new int[]{1}, 0, 1, 0));
//        assertEquals(-1, binarySearch(new int[]{1}, 0, 1, 2));
        assertEquals(-1, binarySearch(new int[]{1,1}, 0, 2, 0));
        assertEquals(-1, binarySearch(new int[]{1}, 0, 1, 0));
        assertEquals(-1, binarySearch(new int[]{1,1}, 0, 2, 2));
        assertEquals(-1, binarySearch(new int[]{1,2}, 0, 2, 0));
//        assertEquals(-1, binarySearch(new int[]{1,2}, 0, 2, 3));
        assertEquals(-1, binarySearch(new int[]{}, 0, 0, 0));
        assertEquals(1, binarySearch(new int[]{1,2,3}, 0, 3, 2));
        assertEquals(1, binarySearch(new int[]{1,2,3,4}, 0, 4, 2));
        assertEquals(2, binarySearch(new int[]{1,2,3,4}, 0, 4, 3));
    }
}
