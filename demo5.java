import java.util.*;
public class demo5 {
    public static void main(String[] args) {
        System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial =1;
        for(int i=1; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial="+factorial);
    }
}