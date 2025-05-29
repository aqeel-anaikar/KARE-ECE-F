import java.util.Scanner;
public class sumofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        // for(int i = 1; i<=a ; i++){
        //     b+=i;
        // }
        System.out.println("sum ="+(a*(a+1))/2);
    }
}


// 21

//a =  21 /10 = 2
//b =  21 %10 = 1

// (b*10) + a;