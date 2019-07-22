import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {

        ComparableCircle[] circles = new ComparableCircle[2];
        circles[1] = new ComparableCircle();
        circles[0] = new ComparableCircle(6.5);

        System.out.println("Trc khi sx: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);

        System.out.println("Sau khi sx: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
