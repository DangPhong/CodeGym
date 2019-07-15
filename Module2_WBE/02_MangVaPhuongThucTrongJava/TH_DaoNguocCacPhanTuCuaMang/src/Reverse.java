public class Reverse {

    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void reverseArr(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3, 5, 6, 7, 8};
        System.out.println("Mảng trước khi đảo: ");
        xuatMang(a);
        System.out.println();
        System.out.println("Mảng sau khi đảo: ");
        reverseArr(a);
        xuatMang(a);
    }
}
