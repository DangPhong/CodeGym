import java.util.Scanner;

public class UCLN {
    public static void timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có UCLN");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else
                b = b - a;
        }
        System.out.println("UCLN của a và b là " + a);
    }

    public static void main(String[] args) {
        timUCLN(6, 4);
        timUCLN(2, 3);
        timUCLN(6, 12);
    }
}
