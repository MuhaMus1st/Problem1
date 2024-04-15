// 4 Pro a
// Complexity: linear - O(n)
import java.util.Scanner;

public class Pro4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(f(n));
    }

    static int f(int n) {

        if (n == 1)
            return n;

        return n * f(n - 1);
    }
}
