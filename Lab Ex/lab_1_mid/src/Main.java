import java.util.Arrays;
import java.util.Scanner;
//exercise 7
public class Main {
    /*public static void primeOrNot(int[] arr, int i, boolean isPrime) {
        for (int q = 2; q < arr[i]/2; q++) {
            if (arr[i] % q == 0) {
                isPrime = true;
            }
        }
        if (isPrime) System.out.println(arr[i] + " is not prime");
        else System.out.println(arr[i]+ " is prime");
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum=0,sumO=0,sumE=0,max=arr[0],min=999,temp;
        boolean isPrime=false;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i) + ": ");
            arr[i] = sc.nextInt();
            int index = 0;
            while(index <= arr[i]/2) {
                int del = 2;
                if (arr[i] % del == 0) {
                    System.out.println(arr[i] + " is not a prime number.");
                } else System.out.println(arr[i] + " is a prime number.");
                del++;
                index++;
            }
        }
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