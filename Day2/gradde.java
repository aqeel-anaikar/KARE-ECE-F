public class gradde {
    public static void main(String[] args) {
        int mark1 = 80, mark2 = 50, mark3 = 70;
        int total= mark1+mark2+mark3;
        int avg = total/3;
        int pass = 40;
        if(mark1>=pass&& mark2>=pass&& mark3>=pass){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println(avg);
        if(avg>=90){
            System.out.println("S grade");
        }
        else if(avg>80){
            System.out.println("A garde");
        }
        else if(avg>70){
            System.out.println("B grade");
        }
        else{
            System.out.println("Poor grade");
        }
    }
    
}
