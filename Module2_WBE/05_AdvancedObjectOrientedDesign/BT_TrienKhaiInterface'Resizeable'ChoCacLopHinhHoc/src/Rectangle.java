public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle width= "
                + getWidth() + " and "
                + getHeight() + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width += this.width * (percent / 100);
        this.height += this.height * (percent / 100);
    }
}
