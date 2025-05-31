import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ,min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        int arr [] = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            // 100 < 1
            if(min>arr[i]){ // min = 1 > 
                min= arr[i];
            }
            if(max<arr[i]){   // max = 4 < 5
                max= arr[i]; //  max = 5
            }

        }
        System.out.println("Minimum = "+min);
        System.out.println("Maximum = "+max);
    }
}
