import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name:\n");
        String name = sc.nextLine();
        System.out.println("Enter your register number:\n");
        int reg = sc.nextInt();
        System.out.println("Enter your total number of subjects:\n");
        int sub = sc.nextInt();
        System.out.println("Enter your subject1 mark:\n");
        int m1 = sc.nextInt();
        System.out.println("Enter your subject2 mark:\n");
        int m2 = sc.nextInt();
        int total = m1+m2;
        int avg = total/sub;
        if (avg > 35){
            System.out.printf("Hi %s your resgister number is %d.\n Your total average is %d and you are pass",name,reg,avg);
        }
        else{
            System.out.printf("Hi %s your resgister number is %d.\n Your total average is %d and you are fail",name,reg,avg);
        }
     }
    }
