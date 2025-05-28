import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("enter a number");
        int A = sc.nextInt();
        for(int i=1; i <=10; i++){
        System.out.println(A +" x "+i+" = "+i*A);
        }
    }
}
