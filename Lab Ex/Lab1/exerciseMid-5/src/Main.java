import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        //exercise 5 => 2D array
        Scanner sc = new Scanner(System.in);
        System.out.print("NxN matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int sumPd = 0;
        int sumSd = 0;
        int sumWoMidEl = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i+j == n-1) {
                    sumWoMidEl += arr[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j ) {
                    sumPd += arr[i][j];
                }
                if((i+j) == n-1 ) {
                    sumSd += arr[i][j];
                }
            }
        }
        int sum = sumPd + sumSd;
        System.out.println("Sum: " + sum);
        System.out.print("Sum Without: " + sumWoMidEl);
    }
}