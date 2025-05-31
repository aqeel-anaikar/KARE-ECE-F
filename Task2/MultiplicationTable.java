// Program to print the multiplication table of a given number
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }
}
