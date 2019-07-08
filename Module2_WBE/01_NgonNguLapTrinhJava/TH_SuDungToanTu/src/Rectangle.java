import java.util.Scanner;

public class Rectangle {
    public static float getAreaRect() {
        float width, height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        width = scanner.nextFloat();
        System.out.print("Nhập chiều rộng: ");
        height = scanner.nextFloat();
        float area = (width * height);
        System.out.println("Diện tích HCN là: " + area);
        return area;
    }

    public static void main(String[] args) {
        getAreaRect();
    }
}
