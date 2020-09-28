public class Point2D {
   /* public static void main(String[] args) {
       Point2D a = new Point2D(2, 3);
        System.out.println(a.toString());
    }


    */
    int x;
    int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return Integer.toString(x) + "," + Integer.toString(y);
    }

    public void Test(){

    }
}
