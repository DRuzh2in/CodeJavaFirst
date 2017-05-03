import circleIn.Circle;
import circleIn.InCircle;
import circleIn.Return;

import org.junit.Test;

import static circleIn.InCircle.inCircle;
import static circleIn.Return.CONTAINS;
import static circleIn.Return.INTERSECTS;
import static circleIn.Return.NO_INTERSECTS;
import static org.junit.Assert.assertEquals;

/**
 * Created by vdruzhinin on 5/3/2017.
 */
public class circleInTest {

    @Test
    public void test(){

        Circle circle1 = new Circle(2, 2, 1);
        Circle circle2 = new Circle(5, 5, 1);
        Return relation = inCircle(circle1, circle2);
        assertEquals(NO_INTERSECTS, relation);

        circle1 = new Circle(3, 3, 1);
        circle2 = new Circle(5, 5, 5);
        relation = inCircle(circle1, circle2);
        assertEquals(CONTAINS, relation);

        circle1 = new Circle(5, 5, 5);
        circle2 = new Circle(3, 3, 1);
        relation = inCircle(circle1, circle2);
        assertEquals(CONTAINS, relation);

        circle1 = new Circle(5, 5, 2);
        circle2 = new Circle(3, 3, 1);
        relation = inCircle(circle1, circle2);
        assertEquals(INTERSECTS, relation);
    }


}
