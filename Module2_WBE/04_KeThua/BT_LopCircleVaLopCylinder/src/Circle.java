public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return " Hình có màu là " + getColor() + " có bán kính là: " + getRadius();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "yellow");
        System.out.println(circle);
    }
}
