import java.util.Scanner;
public class subjectmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths Marks:");
        int a = sc.nextInt();
        System.out.print("Enter English Marks:");
        int b = sc.nextInt();
        System.out.print("Enter Science Marks:");
        int c = sc.nextInt();
        System.out.print("Enter Social Marks:");
        int d = sc.nextInt();
        System.out.print("Enter Language Marks:");
        int e = sc.nextInt();
        System.out.println("Math:      "+a);
        System.out.println("English:   "+b);
        System.out.println("Science:   "+c);
        System.out.println("Social:    "+d);
        System.out.println("Language:  "+e);
        System.out.println("Total:     "+(a+b+c+d+e));
        System.out.println("Avg:       "+(a+b+c+d+e)/5);
    }
}
