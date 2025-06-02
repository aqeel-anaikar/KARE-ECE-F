// import java.util.Arrays;
// public class hi {

//     public static void main(String[] args) {
//         int [][] arr =   
//         {
//             {1,2,3},
//             {4,5,6},
//             {7,100,9}
//         };   // Static

//         for (int i = 0; i <3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.println(arr[i][j]);
//             }
//         }
//     }
// }
import java.util.*;
public class hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [][] = new int [3][3];//Dynamic 2d Array
        
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}