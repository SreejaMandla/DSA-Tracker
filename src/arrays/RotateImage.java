class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    
        for (int[] row : matrix) {
            int left = 0;
            int right = row.length - 1;
            while (left < right) {
                int temp = row[right];
                row[right] = row[left];
                row[left] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        int[][] matrix1 = {{1, 2}, {3, 4}};
        System.out.println("Original Matrix:");
        printMatrix(matrix1);
        solution.rotate(matrix1);
        System.out.println("Rotated Matrix:");
        printMatrix(matrix1);
     
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix2);
        solution.rotate(matrix2);
        System.out.println("Rotated Matrix:");
        printMatrix(matrix2);
    }
    
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");  
            }
            System.out.println();  
        }
    }
}