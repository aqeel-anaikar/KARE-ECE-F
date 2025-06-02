/*
 *  a = 10    01010
 *  b = 20    10100
 * 
 *  a = a^b   10100
 *           
 *  b = a^b 10101
 * 
 *          11110
 *  
 *  a = a^b  1011
 * 
 * 
 *  print (a = 20)
 *  print (b = 10)
 */


// Count the Digits
//  public class hi {
//    public static void main(String[] args) {
//         int n = 10000;
//         int count = 0;
//         while (n!= 0) {
//             count++;
//             n/=10;
//         }
//         System.out.println(count);
//     }
//  }
// String Functions 
// public class hi {

//     public static void main(String[] args) {
//         String s = "ASDF";// C type Decleration
//         String s1 = new String("String");// Object
//         System.out.println();

//     }
// }

// public class hi {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         // Foreach loop   
//         for (int j : arr) 
//         {
//             System.out.println(j);
//         }    
//     }
// }

public class hi {
    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer("ASDF ");
        sb.append("String");
        sb.append(" ");
        sb.append("is Mutable");
        System.out.println(sb);
        
    }
}