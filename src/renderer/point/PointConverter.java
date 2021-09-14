package renderer.point;

import java.awt.Point;

import renderer.Display;

public class PointConverter {

    public static Point convertPoint(MyPoint point3D) {
        int x2d = (int) (Display.WIDTH / 2 + point3D.y);
        int y2d = (int) (Display.HEIGHT / 2 - point3D.z);

        Point point2D = new Point(x2d, y2d);
        return point2D;
    }
}
