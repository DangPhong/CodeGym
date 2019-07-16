import java.util.Scanner;

public class SumColumn {

    public static void nhapMang(int arr[][]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void xuatMang(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void tinhTongCot(int arr[][], int cot) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + arr[i][cot];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int array[][] = new int[3][4];
        nhapMang(array);
        xuatMang(array);
        tinhTongCot(array, 2);
    }
}
