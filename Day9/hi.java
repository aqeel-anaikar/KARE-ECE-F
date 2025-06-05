// Single Level
// Multi level 
// Hierachical 
// Multiple
// class math {
//     void formula(){
//         System.out.println("(A+B)^2 = A^2 + 2AB + B^2");
//     }
// }
// class chemistry extends math
// {
//     void display(){
//         System.out.println("Nothing");
//     }
// }
// class physics extends math{
//     void show(){
//         System.out.println("access");
//     }
// }
// class polymorphism
// {
//     // int add(int a,int b){
//     //     return a+b;
//     // }

//     // int add(int a){
//     //     return ++a;
//     // }

//     // double add (double a,double b){
//     //     return a+b;
//     // }
//     // char[] add (char a[]){
//     //     return a;
//     // }
//     // String add (String a,String b){
//     //     return a+b;
//     // }
// }

// class AnimalSound{
//     void sound(){
//         System.out.println("Animal Makes Sound");        
//     }
// }
// class Dog extends AnimalSound
// {
//     void sound(){
//         System.out.println("Barks");
//     }
// }
// class Cat extends AnimalSound
// {
//     void sound(){
//         System.out.println("Meows");
//     }
// }


class Car {
    int model_no; 
    String brand;
    
    Car(int model_no){
        this.model_no = model_no;
    }
    Car(int model_no, String brand){
        this.model_no = model_no;
        this.brand = brand;
    }

    void show(){
        System.out.println("Model Number: "+this.model_no);
        System.out.println("Brand: "+this.brand);
    }
}


public class hi {
    public static void main(String[] args) {
       Car Benz = new Car(2015,"Benz");
       Benz.show();
        
        
        
        // AnimalSound animal = new AnimalSound();
        // animal.sound();
        // Dog chimtu = new Dog();
        // chimtu.sound();
        // Cat guru= new Cat();
        // guru.sound();
        
        // polymorphism metho_dover_loding = new polymorphism();
        // char a[] = {'a','b'};
        // System.out.println(metho_dover_loding.add(12,22));

        // physics ch = new physics();
        // ch.formula();
        // ch.show();

    }
}