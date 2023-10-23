import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int[] arr  = new int[3];
        int sum = 0, sumO = 0, sumE = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = scan.nextInt();
            if (arr[i] % 2 == 0)
            {
                sumE += arr[i];
            }
            else
            {
                sumO += arr[i];
            }
            sum += arr[i];
        }
        //exercise 1 => just sum
        System.out.println("Sum of elements: " + sum);
        //exercise 2 => sum of even elements
        System.out.println("Sum of even elements: " + sumE);
        //exercise 3 => sum  of odd elements
        System.out.println("Sum of odd elements: " + sumO);*/

        // exercise 4 => reverse an array
        /*int n = 5, j = n;
        int[] arr = new int[n];
        int[] newArr = new int[j];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            newArr[j - 1] = arr[i];
            j = j - 1;
        }
        for (int el: newArr) {
            System.out.print(el + " ");
        }*/

        //exercise 5 => max Number of array
        /*int n = 5;
        int[] arr = new int[n];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = scan.nextInt();
        }
        int maxNum = arr[0];
        for (int el: arr) {
            if (maxNum < el) {
                maxNum = el;
            } else {
                continue;
            }
        }
        System.out.println(maxNum);*/

        //exercise 6 => matrix
        /*int row = 2;
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
        System.out.println(sumOfSecondRow);*/

        //exercise 9 => even or odd
        /*Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num%2 == 0) {
            System.out.println(num + " is even.");
        }
        else {
            System.out.println(num + " is odd. ");
        }*/

        //exercise 10 => negative or positive
        /*Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println(num + " is positive.");
        }
        else {
            System.out.println(num + " is negative. ");
        }*/

        //exercise 11 => greater than 10
        /*Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = scan.nextInt();
        if (num > 10) {
            System.out.println(num + " is greater than 10.");
        }
        else {
            System.out.println(num + " is less than 10 ");
        }*/

        //exercise 12 => equal nums
        /*Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number = ");
        int num2 = scan.nextInt();
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal");
        }
        else {
            System.out.println(num1 + " and " + num2 + " are mot equal");
        }*/

        //exercise 13 => prime nums
        /*Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = scan.nextInt();
        if(num<=1)
        {
            return;
        }else {
            for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0){
                    System.out.println(num + " is not a prime number");
                    return;
                }
            }
            System.out.println(num + " is a prime number");
        }*/

        //exercise 14 => n shape of *
        /*Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //exercise 15 => triangle of *
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}