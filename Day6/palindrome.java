import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        char arr[] = str.toCharArray();
        int flag = 0;
        for (int i = 0,j=str.length()-1; i < j; i++,j--)
        {
            if (arr[i]!=arr[j]) {
                System.out.println("Not a Palindrome");
                flag = 0;
                break;
            } 
            else{
                flag = 1;
            }
        }
        if (flag==1) {
            System.out.println("Palindrome");
        }
    }
}
