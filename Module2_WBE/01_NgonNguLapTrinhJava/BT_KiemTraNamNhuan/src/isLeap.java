public class isLeap {
    public static void isLeap(int year) {
        if (year < 0) {
            System.out.println(year + " là năm TCN!!");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " là năm nhuận");
        } else System.out.println(year + " ko phải là năm nhuận");
    }

    public static void main(String[] args) {
        isLeap(-1111);
        isLeap(2000);
        isLeap(2001);
    }
}
