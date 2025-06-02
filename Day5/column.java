import java.util.Scanner;
public class column{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int arr [][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < arr.length; i++) {
                sum = sum+arr[i][index];
                
            }
            System.out.println(sum);
            sum = 0;
        }    
    }
}





//   _      _
//  | 1 2 3  |
//  | 4 5 6  | 
//  | 7 8 9  |
//  |_      _|
//       +
//   _      _
//  | 3 2 1  |
//  | 6 5 4  | 
//  | 9 8 7  |
//  |_      _|
//   4  4  4
//   10 10 10
//   16 16 16