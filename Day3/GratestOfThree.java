// 12 33 25
import java.util.Scanner;

public class GratestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;

        for(int i = 0;i<3;i++){
            int z = sc.nextInt();
            if(temp<z){      //25 < 50
                temp = z;    // temp = 50
            }
        }
        System.out.println(temp);
    }
}