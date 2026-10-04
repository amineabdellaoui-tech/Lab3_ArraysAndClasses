package ma.um6p.lab3.ex5;

public class ArrayExercise5 {
    public static int[][] matrixAdd(int[][] matrix1,int[][] matrix2){
        int[][] finalMatrix=new int[matrix1.length][matrix1[0].length]; //creating a new matrix to hold the sum result

        for(int i=0;i<matrix1.length;i++){ //using a loop through rows and columns to put the sum of the correct position
            for(int j=0;j<matrix1[i].length;j++){
                finalMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return finalMatrix;
    }

    public static void main(String[] args){ //test
        int[][] matrixA = {
                {2, 4, 6, 8},
                {10, 12, 14, 16},
                {18, 20, 22, 24},
                {26, 28, 30, 32}
        };

        int[][] matrixB = {
                {1, 3, 5, 7},
                {9, 11, 13, 15},
                {17, 19, 21, 23},
                {25, 27, 29, 31}
        };

        int[][] sumMatrix=matrixAdd(matrixA,matrixB);

        //printing
        for(int i=0;i<sumMatrix.length;i++) {
            for(int j=0;j<sumMatrix[i].length;j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
