import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exercises 1,2,3,4 => all in exercise 7
        Scanner sc = new Scanner(System.in);
        System.out.print("Elements of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if (num <= 1) {
                System.out.println(num + " is not a prime number");
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(num + " is a prime number");
                } else {
                    System.out.println(num + " is not a prime number");
                }
            }
        }
        int sum=0,sumO=0,sumE=0,max=arr[0],min=arr[0],temp;
        for (int j : arr) {
            sum += j;

            if (j % 2 == 0) sumE += j;
            else sumO += j;

            if (max < j) max = j;
            if (j < min) min = j;
        }
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        System.out.println("Sum: "+sum);
        System.out.println("Even Sum: "+sumE);
        System.out.println("Odd Sum: "+sumO);
        System.out.println(Arrays.toString(arr));
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
