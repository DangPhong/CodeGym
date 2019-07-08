import java.util.Scanner;

public class LinearEquationResolver {
    public static void giaiPhuongTrinhBacNhat() {
        float nghiem, a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = scanner.nextFloat();
        System.out.println("Nhập b: ");
        b = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Pt vô số nghiệm! ");
            } else
                System.out.println("Pt vô nghiệm");
        } else {
            nghiem = -b / a;
            System.out.println("Phương trình có nghiệm là: " + nghiem);
        }

    }

    public static void main(String[] args) {
        giaiPhuongTrinhBacNhat();
    }
}
