// 10 Problema uffffffffffffffffffffffffffffffff
// Logarithmic - O(log(n))

import java.util.Scanner;

public class Pro10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {

        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}
