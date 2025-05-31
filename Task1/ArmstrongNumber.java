import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int original = num, sum = 0, digits = 0, temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        temp = num;
        while (temp != 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.println(sum == original ? "Armstrong Number" : "Not an Armstrong Number");
    }
}
