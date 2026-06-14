import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Even digits in reverse order: ");

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }

            num /= 10;
        }

        sc.close();
    }
}