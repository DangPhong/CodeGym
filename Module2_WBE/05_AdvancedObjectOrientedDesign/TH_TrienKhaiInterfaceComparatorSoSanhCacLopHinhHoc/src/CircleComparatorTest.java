import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(6.3);
        circles[1] = new Circle();

        System.out.println("Trước khi sắp xếp: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("Sau khi sắp xếp: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
