package others;

/**
 * Problem : rotating-the-box
 */
public class RotateTheBox {

        public static void main(String argv[]) {

                char[][] matrix_sample = {
                        {'1', '2', '*', '3'},
                        {'4', '5', '.', '6'},
                        {'7', '.', '8', '.'},

                };

                printMatrix(matrix_sample);
                char[][] matrix2 = transposeMatrix(matrix_sample);
                System.out.print("Step 1: Transpose Completed \n");
                printMatrix(matrix2);
                char[][] matrix3 = completeRotation(matrix2);
                System.out.print("Step 2: Rotate Completed \n");
                printMatrix(matrix3);
                char[][] matrix4 = applyGravity(matrix3);
                System.out.print("Step 3: Gravity Applied \n");
                printMatrix(matrix4);

        }

        public static void printMatrix(char[][] matrix) {
                for (char[] row : matrix) {
                        for (char val : row) {
                                System.out.print(val + " ");
                        }
                        System.out.println();
                }
        }

        public static char[][] transposeMatrix(char[][] matrix) {

                int rows = matrix.length;
                int cols = matrix[0].length;
                char[][] flipped = new char[cols][rows];

                for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                                try {
                                        System.out.println(" Transpose : Working on Item " + matrix[i][j]);
                                        if (matrix[i][j] == '\u0000') {
                                                System.out.println("Transpose : Item " + matrix[i][j] + " Empty");
                                        }
                                        flipped[j][i] = matrix[i][j];
                                } catch (ArrayIndexOutOfBoundsException aEx) {
                                        System.out.println("Transpose : Array Out of Bound Exception");
                                }
                        }
                }


                return flipped;

        }

        public static char[][] completeRotation(char[][] matrix) {

                int rows = matrix.length;
                int cols = matrix[0].length;
                char[][] matrix3 = new char[rows][cols];


                for (int i = 0; i < rows - 1; i++) {
                        int processCol = (cols / 2);
                        for (int j = 0; j < processCol; j++) {
                               char tmp = matrix[i][j];
                                char tmp2 = matrix[i][cols - 1 - j];
                                System.out.println("Rotation : To Item  " + matrix[i][cols - 1 - j]);
                                matrix[i][cols - 1 - j] = tmp;
                                matrix[i][j] = tmp2;

                        }
                }
                return matrix;
        }

        public static char[][] applyGravity(char[][] matrix) {

                int row_count = matrix.length;
                int column_count = matrix[0].length;
                char[][] matrix4 = new char[row_count][column_count];

                for (int col = 0; col < column_count; col++) {
                        for (int row = row_count-1; row >= 1; row--) {
                                if (row >= 1) {
                                        if (matrix[row][col] == '.' && matrix[row-1][col] != '*' ) {
                                                matrix[row][col] = matrix[row-1][col];
                                                matrix[row-1][col] = '.';
                                                System.out.println("Flip Completed for this pair > " + matrix[row][col] +" & " + matrix[row-1][col] );
                                        } else {
                                                System.out.println("No Space at the bottom in this pair >" + matrix[row][col] +" & " + matrix[row-1][col]);

                                        }

                                }
                        }
                }

                return matrix;

        }
}
