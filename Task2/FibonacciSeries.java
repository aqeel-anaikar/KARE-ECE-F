// Program to print the first n terms of Fibonacci series
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            if (i < n - 1) System.out.print(", ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
