package circleIn;

import static circleIn.Return.CONTAINS;
import static circleIn.Return.INTERSECTS;
import static circleIn.Return.NO_INTERSECTS;
import static java.lang.Math.sqrt;

/**
 * Created by vdruzhinin on 5/3/2017.
 */
public class InCircle {

    public static Return inCircle (Circle circle1, Circle circle2) {

        double longX = Math.abs(circle1.x) - Math.abs(circle2.x);
        double longY = Math.abs(circle1.y) - Math.abs(circle2.y);
        double distance = sqrt(longX * longX + longY * longY);
        double beeRad = circle1.radius + circle2.radius;
        if(distance > beeRad) {
            return NO_INTERSECTS;
        } else {
            if (circle1.getRadius() >= distance || circle2.getRadius() >= distance){
                return CONTAINS;
            }
        }
        return INTERSECTS;
    }
}
