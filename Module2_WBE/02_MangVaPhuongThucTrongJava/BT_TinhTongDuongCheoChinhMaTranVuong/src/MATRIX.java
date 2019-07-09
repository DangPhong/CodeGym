import java.util.Scanner;

public class MATRIX {

    public static void inputArr(int arr[][], int size) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Arr[" + i + "][" + j + "]= ");
                arr[i][j] = scanner.nextInt();
            }

        }
    }

    public static void outputArr(int arr[][], int size) {
        System.out.println("Mảng đã nhập: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static int getSumCross(int arr[][], int size) {
        int tong = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    tong += arr[i][j];
                }
            }
        }
        return tong;
    }

    public static void main(String[] args) {
        int arr[][];
        int size;
        System.out.print("Nhập bậc của ma trận vuông ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        arr = new int[size][size];
        inputArr(arr, size);
        outputArr(arr, size);
        System.out.println("Tổng của đường chéo ma trận vuông là: " + getSumCross(arr, size));
    }
}
