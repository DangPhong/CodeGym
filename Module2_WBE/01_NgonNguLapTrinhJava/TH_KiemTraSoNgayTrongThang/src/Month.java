public class Month {
    public static void checkDayOfMonth(int month) {
        switch (month) {
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            default:
                System.out.println("Chế nhập sai ngày!!!");
                break;
        }
    }

    public static void main(String[] args) {
        checkDayOfMonth(2);
        checkDayOfMonth(1);
        checkDayOfMonth(4);
        checkDayOfMonth(111);
    }
}
