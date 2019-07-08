public class Prime {

    public static void isPrimeNumber(int n) {
        boolean check = true;
        if (n < 2) check= false;
        if (n == 2) check= true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(n + " là số nguyên tố!");
        } else
            System.out.println(n + " ko phải là số nguyên tố!");
       // return check;
    }

    public static void main(String[] args) {
        isPrimeNumber(2);
        isPrimeNumber(-2);
        isPrimeNumber(4);
    }
}
