import java.util.Scanner;
public class task {   
    static void elmfound(int num, int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int a, c;
        System.out.print("Enter a index value");
        int arr[] = new int[i];
        System.out.println("Enter  array value");
        for (a = 0; a < i; a++) {
            arr[a] = sc.nextInt();
        }
        for (c = 0; c < i; c++) {
            if (arr[c] == num) {
                System.out.println("The give number is present in" + c);
            }
        }
    }
    public static void main(String[] args) {
      elmfound(5, 2);
    }
}
