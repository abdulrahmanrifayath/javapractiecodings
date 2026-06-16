import java.util.Scanner;
public class demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1 -> Check prime no");
        System.out.println("2 -> Check armstrong no");
        System.out.println("3 -> Check strong no");
        System.out.println("4 -> Check twin prime no");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        int num1 = 0, num2 = 0;
        if (choice >= 1 && choice <= 3) {
            System.out.print("Enter a number: ");
            num1 = sc.nextInt();
        } else if (choice == 4) {
            System.out.print("Enter first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            num2 = sc.nextInt();
        }
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
                isTwinPrime(num1);
            default:
                System.out.println("Invalid choice! Please select between 1 and 4.");
                break;
        }

        sc.close();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
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
    public static void isTwinPrime(int a) {
        for(int i=1;i<=a;i++){
            if(isPrime(i) && isPrime(i+2)){
                System.out.println(i + " and " + (i+2) + " are twin primes.");
            }
        }
    }
}