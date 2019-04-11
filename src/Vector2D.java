import java.lang.Math;

public class Vector2D {
    protected double x;
    protected double y;


    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getLength() {
        double z = (x * x) + (y * y);
        return Math.sqrt(z);
    }
}

