public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        double v = Math.PI * getRadius() * getRadius() * this.height;
        //System.out.println("Thể tích hình trụ là: " + v);
        return v;
    }

    @Override
    public String toString() {
        return "Hình có chiều cao là " + getHeight()
                + super.toString()
                + " Có thể tích là: " + getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3, "blue", 3);
        System.out.println(cylinder);
    }
}
