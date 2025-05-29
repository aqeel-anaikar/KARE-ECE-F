import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int a = sc.nextInt();
        if (a % 100 == 0) {
            if (a % 400 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("not aLeap Year");

            }
        } else {
            if (a % 4 == 0) {
                System.out.println("a leap year");
            } else {
                System.out.println("not a Leap Year");

            }
        }

    }
}