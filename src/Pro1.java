import java.util.Scanner;

// 1 Problem

public class Pro1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        System.out.println(getMin(n));
    }

    private static int getMin(int n, int mn) {

        if (n == 0)
            return mn;

        int num = scanner.nextInt();

        if (mn > num)
            mn = num;

        return getMin(n - 1, mn);
    }

    public static int getMin(int n) {
        return getMin(n, 2147483647);
    }
}