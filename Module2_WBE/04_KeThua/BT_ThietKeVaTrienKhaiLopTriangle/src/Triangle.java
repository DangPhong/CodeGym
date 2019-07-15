public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        double chuVi = this.side1 + this.side2 + this.side3;
        return chuVi;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        double S = Math.pow(p * (p - this.side1) * (p - this.side2) * (p - this.side3), 0.5);
        return S;
    }

    public String toString() {
        return super.toString() + ", có diện tích là: " + getArea() + ", có chu vi là: " + getPerimeter();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("blue", 3, 6, 9);
        System.out.println(triangle);
    }
}
