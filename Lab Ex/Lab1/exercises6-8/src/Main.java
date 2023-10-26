import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        int[][] matrix = new int[row][col];
        int sumDiagonals = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element " + (i)+"."+(j) + ": ");
                matrix[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j || (i+j) == (row - 1)) {
                    sumDiagonals += matrix[i][j];
                }
            }
        }

        int sumOfFirstRow =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0) {
                    sumOfFirstRow += matrix[i][j];
                }
            }
        }

        int sumOfSecondRow =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 1) {
                    sumOfSecondRow += matrix[i][j];
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //exercise 6 => sum of diagonals in matrix
        System.out.println(sumDiagonals);
        //exercise 7 => sum of the elements on first row of matrix
        System.out.println(sumOfFirstRow);
        //exercise 8 => sum of the elements on second row of matrix
        System.out.println(sumOfSecondRow);

    }
}