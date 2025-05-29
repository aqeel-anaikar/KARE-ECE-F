import java.util.Scanner;
public class reverseanum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int a = n/10;
        int b = n%10;
        System.out.print((10*b)+a);
    }
}