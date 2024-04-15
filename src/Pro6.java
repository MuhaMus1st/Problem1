// 6 Problema
// linear O(n)
import java.util.Scanner;

public class Pro6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(pow(a, n));
    }

    public static int pow(int a, int n) {

        if (n == 0) {
            return 1;
        }

        return pow(a, n - 1) * a;
    }
}
