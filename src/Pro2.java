// 2 Problem
// Complexity: linear - O(n)
import java.util.Scanner;

public class Pro2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        System.out.println(getAvg(n));
    }

    public static float getAvg(int n, float sum, int size) {
        float ans = sum / size ;

        if (n == 0) return ans;

        int a = scanner.nextInt();

        sum += a;

        return getAvg(n - 1, sum, size);
    }

    private static float getAvg(int n){
        return getAvg(n, 0, n);
    }
}
