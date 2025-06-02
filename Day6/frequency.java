import java.util.Arrays;
import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = sc.nextInt(),m;
        int arr[] = new int[n];

        System.out.println("Array Values :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        m=arr[arr.length-1];
        int cpy[] = new int[m+1];

        for (int i = 0; i < arr.length; i++) {
            cpy[arr[i]]++; //cpy[5]++
        }
        for (int i = 0; i < cpy.length; i++) {
            if (cpy[i]>1){ 
                System.out.println("Frequency :"+i+" ");
            }
        }
    }
}
// String s = "EAT"
//char arr[] = s.toCharArray();
//['E','A','T']