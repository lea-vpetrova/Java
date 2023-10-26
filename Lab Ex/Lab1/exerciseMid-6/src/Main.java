import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //exercise 6
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}