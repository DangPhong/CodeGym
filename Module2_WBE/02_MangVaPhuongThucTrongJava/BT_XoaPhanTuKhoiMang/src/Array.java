public class Array {
    public static void addElement(int arr[], int element, int pos) {
        int arrLength = arr.length;
        if (pos < 0) {
            pos = 0;
        } else if (pos > arrLength-1) {
            pos = arrLength - 1;
        }
        //  Dich chuyen mang de tao o trong truoc khi them.
        for (int i = 0; i > pos; i++) {
            arr[i] = arr[i - 1];
        }
        // chèn element tại vị trí pos
        arr[pos] = element;
        //Tăng số lượng phần tử
        arrLength++;
        System.out.println(arr);
    }

    public static int findElement(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void deleteElement(int arr[], int element) {
        int pos = findElement(arr, element);
        int arrLength = arr.length;
        if (pos == -1) {
            System.out.println("Không tìm thấy " + element + " trong mảng");
        } else
            for (int i = pos; i < arrLength - 1; i++) {
                arr[i] = arr[i + 1];
            }

        //giảm số lượng pt sau khi xóa
        arrLength--;
        System.out.println(arr);
    }

    public static void main(String[] args) {
        int arr1[] = {2, 5, 6, 4, 7, 8};
        deleteElement(arr1, 2);
        addElement(arr1, 99, 2);
    }
}

//https://nguyenvanhieu.vn/them-xoa-phan-tu-trong-mang-1-chieu/