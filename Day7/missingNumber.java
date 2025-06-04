import java.util.*;
public class missingNumber
 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n= sc .nextInt();
      int [] arr = new int[n];
      
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }

      for(int i=0; i<n-1; i++){
        if(arr[i+1]==arr[i]+1){
            continue;
        }
        else{
            System.out.print(arr[i]+1);
        }
        
      }
    }
}
