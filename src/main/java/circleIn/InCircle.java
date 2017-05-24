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
        double R1 = circle1.getRadius();
        double R2 = circle2.getRadius();

        double longX = Math.abs(circle1.x - circle2.x);
        double longY = Math.abs(circle1.y - circle2.y);
        double distance = sqrt(longX * longX + longY * longY);
        double beeRad = R1 + R2;
        if(distance > beeRad) {
            return NO_INTERSECTS;
        }
        else{
            if(distance <= R1 || distance <= R2){
                if(distance + R1 > R2 || distance + R2 > R1 ){
                    return INTERSECTS;
                }
                return CONTAINS;
        }


        }
        return INTERSECTS;
    }
}
