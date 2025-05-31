public class product2matrix {
    public static void main(String[] args) {
                int [][] matrix1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int [][] matrix2 = {
            {3,2,1},
            {6,5,4},
            {9,8,7}
        };
        int arr[][] = new int[3][3];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    arr[i][k]+=matrix1[i][j]*matrix2[j][k];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
