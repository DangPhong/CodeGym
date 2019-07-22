public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }
//
//    public Circle(String color, boolean filled, double radius) {
//        super(color, filled);
//        this.radius = radius;
//    }


    @Override
    public void resize(double percent) {
        this.radius += percent / 100;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPrimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "Circle with radius "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
