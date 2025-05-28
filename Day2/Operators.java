/* Relational Operators/ Comparison operator
     < , <= , > , >= , == , !=

    Logical Operators
     && , || , !

    Bitwise Operators
     & , | , ^ , ~ , << , >>

     1010
     1011
     ----
     0001

    Assignment Operators
    = , += , -= , *= , /= , %=

    A = 10;
    B = 200;
    
    B += A  // B = B+A;

    Unary Operators

    Pre and Post
    ++ -- 

    int a = 10;
    ++a; --> 11
    a++ 
    -->11

    Ternary Operators

    ? : ;
    


 */

// Control Flow
//Simple if else

//Nested If
// public class Operators {
//     public static void main(String[] args) {
//         int pass  = 35;
//         int mymark = 100;
    
//         if (mymark>=pass) {
//             System.out.println("Pass");
//             if (mymark>=50) {
//                 System.out.println("graterthan 50");
//                 if (mymark>=90) {
//                     System.out.println("Above 90");
//                     if (mymark==100) {
//                         System.out.println("Centum");
//                     }
//                 }
//             }
//         }
//         else{
//             System.out.println("Fail");
//         }
//     }
// }
//Else-if Ladder
// public class Operators {
//     public static void main(String[] args) {
//         int pass  = 35;
//         int mymark = 100;
    
//         if (mymark==100) {
//             System.out.println("Centum");
//         }
//         else if(mymark>=50){
//             System.out.println("Above 50");
//         }
//         else if(mymark >=pass){
//             System.out.println("Pass");
//         }
//         else{
//             System.out.println("Fail");
//         }
//     }
// }


// import java.util.*;
// public class Operators {

//     public static void main(String[] args) {
//         Scanner  sc = new Scanner(System.in);
//         System.out.print("Enter Switch No: ");
//         int swt = sc.nextInt();
//         switch (swt) {

//             case 1: System.out.println("Fan");                
//                 break;
//             case 2: System.out.println("Light");                
//                 break;
//             case 3: System.out.println("AC");                
//                 break;
//             default:System.out.println("Check the Switch"); 
        
//         }
//     }
// }

// Looping statements
// for, while, do while , for each

// for(initilization ; condition ; increment/decrement)

// public class Operators {

//     public static void main(String[] args) {

//         for (int i = 1; i <=10 ; i++) {
//             System.out.println(i+" Sreedeep");
//         }
//     }
// }


/*
 * 2 x 1 = 2
 * 2 x 2 = 4
 * 2 x 3 = 6
 * 2 x 4 = 8
 * 2 x 5 = 10
 * 2 x 6 = 12
 * ..
 * 2 x 10 = 20
 */


// public class Operators {

//     public static void main(String[] args) {
//         int i = 1;

//         do{
//             i++;
//             System.out.println(i+" Sreedeep"); 
//         }while(i<=10);
//     }
// }


public class Operators {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                System.out.println("#");
            }
            
        }
    }
}

// https:github.com/aqeel-anaikar/KARE-ECE-F