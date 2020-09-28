public class Point3D extends Point2D {

    public static void main(String[] args) {
        Point3D a = new Point3D(3, 4, 8);
        System.out.println(a.toString());
    }


    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
     }

    @Override
    public String toString() {
        Point2D b = new Point2D(this.x, this.y);

        return b.toString() + "," + Integer.toString(z);
    }
}
