public class Vector3D extends Vector2D {

    private double z;

    public Vector3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public double getLength() {
        double a = (this.x * this.x) + (this.y * this.y) + (z * z);
        return Math.sqrt(a);

    }
}

