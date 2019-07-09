
public class ElementArray {

    public static void findElementInArray(String arr[], String element) {
        boolean isExit = false;
        int index;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                index = i;
                System.out.println("Có phần tử " + arr[index] + " trong mảng" + " tại vị trí " + index);
                isExit = true;
            }
        }
        if (!isExit)
            System.out.println("Không có phần tử " + element + " trong mảng");
    }

    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila",
                "Sienna", "Tanya", "Connor", "Zachariah",
                "Mallory", "Zoe", "Emily"};
        findElementInArray(students, "Tanya");
        findElementInArray(students, "Phong");
    }
}
