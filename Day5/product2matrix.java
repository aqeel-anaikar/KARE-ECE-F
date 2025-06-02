public class product2matrix {
    public static void main(String[] args) {
                int [][] matrix1 = {
            {1,2,3},
            {4,5,6},
        };
        int [][] matrix2 = {
            {3,2},
            {6,5},
            {9,8}
        };
        int row1=matrix1.length;//3
        int col1=matrix1[0].length;
        int col2=matrix2[0].length;

        int arr[][] = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    arr[i][j]+=matrix1[i][k]*matrix2[k][j];
                }

            }
        }
         for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}