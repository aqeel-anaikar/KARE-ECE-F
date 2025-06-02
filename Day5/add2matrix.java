public class add2matrix {
    
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

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                System.out.print(matrix1[i][j] + matrix2[i][j]+" ");                
            }
            System.out.println();
        }

    }
}
