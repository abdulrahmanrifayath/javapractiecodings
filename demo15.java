import java.util.Scanner;

public class demo15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // =================================================================
        // 1. NUMBER SELECTION
        // =================================================================
        System.out.println("Select an option:");
        System.out.println("1 -> Check Prime Number");
        System.out.println("2 -> Check Armstrong Number");
        System.out.println("3 -> Check Strong Number");
        System.out.println("4 -> Check Twin Prime Numbers");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Variable initialization for case storage
        int num1 = 0, num2 = 0;

        // Prompting user inputs prior to evaluation based on option
        if (choice >= 1 && choice <= 3) {
            System.out.print("Enter a number: ");
            num1 = scanner.nextInt();
        } else if (choice == 4) {
            System.out.print("Enter first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            num2 = scanner.nextInt();
        }

        // =================================================================
        // 2. SWITCH CASE
        // =================================================================
        switch (choice) {
            case 1:
                if (isPrime(num1)) {
                    System.out.println(num1 + " is a Prime number.");
                } else {
                    System.out.println(num1 + " is not a Prime number.");
                }
                break;

            case 2:
                if (isArmstrong(num1)) {
                    System.out.println(num1 + " is an Armstrong number.");
                } else {
                    System.out.println(num1 + " is not an Armstrong number.");
                }
                break;

            case 3:
                if (isStrong(num1)) {
                    System.out.println(num1 + " is a Strong number.");
                } else {
                    System.out.println(num1 + " is not a Strong number.");
                }
                break;

            case 4:
                if (isTwinPrime(num1, num2)) {
                    System.out.println(num1 + " and " + num2 + " are Twin Prime numbers.");
                } else {
                    System.out.println(num1 + " and " + num2 + " are not Twin Prime numbers.");
                }
                break;

            default:
                System.out.println("Invalid choice! Please select between 1 and 4.");
                break;
        }

        scanner.close();
    }

    // =================================================================
    // 3. FUNCTION METHODS
    // =================================================================

    // Function to check if a number is Prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int temp = num, sum = 0, digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = num;
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        return sum == num;
    }

    // Function to check if a number is Strong
    public static boolean isStrong(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int remainder = temp % 10;
            int fact = 1;
            for (int i = 1; i <= remainder; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        return sum == num;
    }

    // Function to check if two numbers are Twin Primes
    public static boolean isTwinPrime(int firstNum, int secondNum) {
        return isPrime(firstNum) && isPrime(secondNum) && Math.abs(firstNum - secondNum) == 2;
    }
}