import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = scan.nextInt();

        //exercise 9 => even or odd
        if (num%2 == 0) {
            System.out.println(num + " is even.");
        }
        else {
            System.out.println(num + " is odd. ");
        }

        //exercise 10 => negative or positive
        if (num > 0) {
            System.out.println(num + " is positive.");
        }
        else {
            System.out.println(num + " is negative. ");
        }

        //exercise 11 => greater than 10
        if (num > 10) {
            System.out.println(num + " is greater than 10.");
        }
        else {
            System.out.println(num + " is less than 10 ");
        }

        //exercise 12 => equal nums
        System.out.print("Enter second number = ");
        int num2 = scan.nextInt();
        if (num == num2) {
            System.out.println(num + " and " + num2 + " are equal");
        }
        else {
            System.out.println(num + " and " + num2 + " are mot equal");
        }

        //exercise 13 => prime nums
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
        }

    }
}