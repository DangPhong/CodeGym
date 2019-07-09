
public class ElementArray {
    public static int index;
    // int index;

    public static void findElementInArray(String arr[], String element) {
        boolean isExit = false;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                isExit = true;
                index = i;
                break;
            }
        }
        if (isExit) {
            System.out.println("Có phần tử " + arr[index] + " trong mảng" + " tại vị trí " + index);
        } else
            System.out.println("Không có phần tử " + arr[index] + " trong mảng");
    }

    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila",
                "Sienna", "Tanya", "Connor", "Zachariah",
                "Mallory", "Zoe", "Emily"};

        findElementInArray(students, "Tanya");
        findElementInArray(students, "Phong");
    }
}
