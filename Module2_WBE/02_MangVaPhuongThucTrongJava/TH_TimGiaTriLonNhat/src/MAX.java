import java.util.Scanner;

public class MAX {

    public static void inputArr(int arr[], int size) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void outputArr(int arr[], int size) {
        System.out.print("Mảng đã nhập: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int findMax(int arr[], int size) {
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[];
        int size;
        System.out.print("Nhập số lượng phần tử: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        arr = new int[size];
        inputArr(arr, size);
        outputArr(arr, size);
        System.out.println();
        System.out.println("Phần tử lớn nhất trong mảng: "+findMax(arr, size));

    }
}
