// 9 Problemaaaaaaaaaa
// Exponential - O(2^n)
import java.util.Scanner;

public class Pro9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(biCo(n, k));
    }

    public static int biCo(int n, int k) {
        if (k == 0 || k == n)
            return 1;

        return biCo(n - 1, k -1) + biCo(n -1, k);
    }
}
