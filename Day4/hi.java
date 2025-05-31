// public class hi {
//     public static void main(String[] args) {
//         int[] ECE_F = new int[10];
//         ECE_F[0] = 5019;
//         ECE_F[1] = 5022;
//         ECE_F[2] = 5024;
//         ECE_F[3] = 5026;
//         ECE_F[4] = 5030;
//         ECE_F[5] = 5032;

//         System.out.println("Roll No: "+ECE_F[0]);
//         System.out.println("Roll No: "+ECE_F[1]);
//         System.out.println("Roll No: "+ECE_F[2]);
//         System.out.println("Roll No: "+ECE_F[3]);
//         System.out.println("Roll No: "+ECE_F[4]);
//         System.out.println("Roll No: "+ECE_F[5]);
//     }
// }


// import java.util.Scanner;
// public class hi {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] ECE_F = new int[10];
        
//         for (int i = 0; i < 10; i++) {
//             ECE_F[i] = sc.nextInt();
//         }

//         for (int i = 0; i < 10; i++) {
//             System.out.println("Roll No: "+ECE_F[i]);
//         }
//     }
// }

// import java.util.Arrays;
// import java.util.Scanner;
// public class hi {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] ECE_F = new int[10]; // Dynamic Array

//         int [] arr = {1,2,3,4,5,6}; // Static Array
        
//         for (int i = 0; i < 10; i++) {
//             ECE_F[i] = sc.nextInt();
//         }       
        
//         System.out.println(Arrays.toString(ECE_F));
//         System.out.println(Arrays.toString(arr));
//     }
// }


import java.util.Arrays;
import java.util.Scanner;
public class hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int [] arr = {1,2,3,4,5,6}; // Static Array
        
        System.out.println(Arrays.toString(arr));
    }
}