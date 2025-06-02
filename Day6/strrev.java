public class strrev {
    public static void main(String[] args) {
        String str = "Hello world";
        String reversed= "";
        for (int i = str.length()-1; i >=0; i--){
            reversed +=str.charAt(i);

        }
        System.out.print(reversed);
    }
}
// i = 0; j =length-1;
//arr[i]; arr[j]
// arr = ['M','A','L','A','Y','A','L','A','M']
//for(int i;i<j;i++,j--){
//arr[i]==arr[j]
//}