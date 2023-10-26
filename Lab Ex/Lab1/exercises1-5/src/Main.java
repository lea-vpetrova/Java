import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Elements in array: ");
        int n = scan.nextInt();
        int[] arr  = new int[n];
        int sum = 0, sumO = 0, sumE = 0;
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
        System.out.println("Sum of odd elements: " + sumO);

        //exercise 4 => reverse array
        int j = n;
        int[] newArr = new int[j];
        for (int i = 0; i < arr.length; i++) {
            newArr[j - 1] = arr[i];
            j = j - 1;
        }
        for (int el: newArr) {
            System.out.print(el + " ");
        }
        System.out.println();
        //exercise 5 => max Number of array
        int maxNum = arr[0];
        for (int el: arr) {
            if (maxNum < el) {
                maxNum = el;
            } else {
                continue;
            }
        }
        System.out.println("Max number: " + maxNum);

    }
}