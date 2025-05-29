public class lefttriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j <4 ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
