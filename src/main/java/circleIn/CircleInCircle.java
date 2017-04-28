package circleIn;

import static java.lang.Math.sqrt;

/**
 * Created by vdruzhinin on 4/28/2017.
 */
public class CircleInCircle {

    private double x;
    private double y;
    private double radius;

    public CircleInCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    String  subsession( CircleInCircle circle1, CircleInCircle circle2) {
        double longX = Math.abs(circle1.x - circle2.x);
        double longY = Math.abs(circle1.y - circle2.y);
        double distance = sqrt(longX * longX + longY * longY);
        double beeRad = circle1.radius + circle2.radius;
        if(distance > beeRad) {
            return "нет пересечений";
        }
        else if(distance < beeRad){
            if (circle1 > )

        }
        return "окружности пересекаются";

    }
}


