public class Exercise {
    /**
     * Method that returns index of the row with maximum sum of elements
     * @param matrix
     * @return int
     */
    public static int getRowWithMaxSum(int[][] matrix){
        int index = 0;
        int maxSum = 0;
        for(int i = 0; i < matrix.length; i++){
            int sum = 0;
            for(int j = 0; j < matrix[0].length; j++){
                sum += matrix[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                index = i;
            }
        }
        return index;
    }
}