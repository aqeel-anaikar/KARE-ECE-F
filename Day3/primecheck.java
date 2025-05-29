import java.util.*;

public class primecheck {
    public static void main(String[] args) {
        Scanner hah = new Scanner(System.in);
        int temp = 0;
        System.out.println("enter a value of n");
        int n = hah.nextInt();
        for (int i = 2; i < Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                temp = 1;
            }
        }                               // 7 -->> 2%7==0 3%7==0 4 5 7%6==0
        if (temp == 1) {
            System.out.println("not a prime number");
        } else {
            System.out.println("prime number");
        }
    }
}



// *
// * *
// * * *
// * * * *