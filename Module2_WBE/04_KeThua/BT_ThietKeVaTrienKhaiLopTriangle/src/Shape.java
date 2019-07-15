import java.util.Scanner;

public class Shape {
    private String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập màu");
        color = scanner.nextLine();
        this.color = color;
    }

    public String toString() {
        return "Hình có màu là: " + getColor();
    }

    public static void main(String[] args) {
        Shape shape = new Shape("yellow");
        System.out.println(shape);
    }
}
