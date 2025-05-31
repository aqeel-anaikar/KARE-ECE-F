// Program to calculate the sum of the series 1 + 1/2 + 1/3 + ... + 1/n
import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("Sum of series: %.5f\n", sum);
    }
}
