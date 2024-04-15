// 3 Problem C++
// O(sqrt(n))
import java.util.Scanner;

public class Pro3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        if (isPrime(n)) System.out.println("Prime");
        else System.out.println("Composite");
    }

    public static boolean isPrime(int n) {

        return isPrime(n, Math.sqrt(n), 2);
    }

    private static boolean isPrime(int n, double sqrt_of_n, int a) {

        if (a > sqrt_of_n) return true;
        if (n % a == 0) return false;
        return isPrime(n, sqrt_of_n, a + 1);
    }
}
