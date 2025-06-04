// Object Oriented Programming Structure (OOPs)

// 1. Class
// 2. Object
// 3. Inheritance 
// 4. Abstraction
// 5. Polymorphism
// 6. Encapsulation
// class engine5kcc{
//     int speed = 5000;
//     String model = "S15";
//     private void show (){
//         System.out.println("This is 5000cc Engine");
//     }

//     void calling()
//     {
//         show();
//     }
// }

// class Defaultclass{
//     String defaultmessage = "I am Default access withi the same package Accessible";
// }
// class ModifierExamples{
//     public String publictmessage = "I am Public access anywhere Accessible";
//     private String privatetmessage = "I am Private access within the same class Accessible";

//     private void displayprivate(){
//         System.out.println(privatetmessage);
//     }
    
//     Defaultclass dc = new Defaultclass();
//     public void displayall(){
//         System.out.println(dc.defaultmessage);
//         System.out.println(publictmessage);
//         displayprivate();
//     }
// }


// class Outer{
//     private String Z= "Private Message"; 

//     class inner{
//         void display(){
//             System.out.println(Z);
//         }
//     }    
//     static class StaticInner{
//         void display2(){
//             System.out.println("Hi this is Static inner class");
//         }
//     }
// }

// class bharath{
//     int add(int a , int b){ // Argument
//         return a+b;
//     }
// }

// class priya{

//     priya(){
//        System.out.println("This is Priya Contructor"); 
//     }
//     priya(int a){
//         System.out.println("This is Parameterized constructor INT "+a);
//     }
//     priya(double a){
//         System.out.println("This is Parameterized constructor DOUBLE"+a);
//     }

// }


// class utteja{
//     static int count= 0;
//     utteja(){
//         System.out.println(count++);
//     }
// }

public class hi {
    // static {
    //     int a = 100;
    //     System.out.println("This is from Static"+a);
    // }
    public static void main(String[] args) {   
         // Command line Argument
        System.out.println("Number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) 
              System.out.println("Argument " + (i + 1) + ": " + args[i]);


        // utteja u1 = new utteja();
        // utteja u2 = new utteja();
        // utteja u3 = new utteja();
        // utteja u4 = new utteja();
        // utteja u5 = new utteja();
        
        // priya prabhas = new priya(10.23);

        // bharath b = new bharath();
        // System.out.println(b.add(10,20)); // paramenter
        
        // Outer obj = new Outer();

        // // Outer.inner inobj = obj.new inner();// Inner Class Object
        // // inobj.display();

        // Outer.StaticInner sobj = new Outer.StaticInner();
        // sobj.display2();
    }
}