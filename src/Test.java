import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int N = 4;
        int M = 5;

        int[][] matrix = new int[N][M];
        System.out.println("\nMatrix filled with random numbers: \n");
        fillMatrix(matrix);
        printMatrix(matrix);
        int rowIndex = Exercise.getRowWithMaxSum(matrix);
        System.out.println("\nIndex of row with maximum  sum of elements: " + rowIndex);
        System.out.println(Arrays.toString(matrix[rowIndex]) + " = " + Arrays.stream(matrix[rowIndex]).sum());
    }

    private static void fillMatrix(int matrix[][]){
        Random rand = new Random();
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = rand.nextInt(10);
            }
    }

    private static void printMatrix(int matrix[][]){
        for(int row[]:matrix)
            System.out.println(Arrays.toString(row));
    }
}