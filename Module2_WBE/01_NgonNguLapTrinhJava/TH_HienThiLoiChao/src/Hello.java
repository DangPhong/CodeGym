import java.util.Scanner;

public class Hello {
    public static void helloGuys() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        helloGuys();
    }
}
