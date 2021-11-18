public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectA = new Rectangle(1, 5);
        Rectangle rectB = new Rectangle(1, 5);
        Rectangle rectC = new Rectangle(5, 8);
        Rectangle rectD = new Rectangle(1, 8);

        System.out.println("прямоугольник со сторонами 1х5 == прямоугольнику 1х5 " +
                " результат " + rectA.compareTo(rectB));
        System.out.println("прямоугольник со сторонами 1х5 == прямоугольнику 5х8 " +
                " результат " + rectB.compareTo(rectC));
        System.out.println("прямоугольник со сторонами 1х5 == прямоугольнику 5х8 " +
                " результат " + rectC.compareTo(rectD));

    }

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {

        return a*b;
    }

    public int compareTo(Rectangle anRectangle) {

        Double RectangleArea = this.area();
        return RectangleArea.compareTo(anRectangle.area());
    }
}
