public class Circle {
    private static double radius = 1.0;
    private static String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(double radius) {
        return radius;
    }

    public double getArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

}
