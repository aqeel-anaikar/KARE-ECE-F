//  find all elements that is grater than all elements than
// to it's right [16 17 4 3 5 2]
// [17 5 2]


// import java.util.Arrays;
// import java.util.Scanner;

// public class hi {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] arr = new int[n]; // 16 17 4 3 5 2 
//         int [] cpy = new int[n]; // 0 0 0 0 0 0
//         int temp = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for (int i = arr.length-1; i >0; i--) {
//             if (arr[i]>temp) {
//               temp = arr[i];
//               cpy[i] = temp;  
//             }
//         }
//         for (int i : cpy) {
//             if (i!=0) {
//                 System.out.print(i+" ");
//             }
//         }

//     }
// }
// import java.util.Scanner;
// public class hi {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("size of array:");
//         int n = sc.nextInt();

//         int[] arr = new int [n];
//         System.out.println("Enter numbers:");
//         for(int i  =0; i<n ; i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Missing numbers:");

//         for(int i = 0; i<n-1;i++){
//             int diff = arr[i+1]-arr[i];

//             if(diff>1){
//                 for(int J=1;J < diff;J++){
//                     System.out.print((arr[i]+J)+" ");
//                 }
//             }
//         }
//     }
// }

public class hi {

    public static void main(String[] args) {
        String a = "10";
        System.out.println(a.hashCode());
    }
}