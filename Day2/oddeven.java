import java.util.Scanner;
public class oddeven {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("It is an even number");

        }
        else{
            System.out.println("it is an odd number");
        }


    }
}
