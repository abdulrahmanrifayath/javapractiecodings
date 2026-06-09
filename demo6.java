import java.util.*;
public class demo6{
    public static void main(String[] args){
        System.out.print("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0 , b = 1 ;
        for (int i = 1; i<=num ; i++) {
            System.out.print(a+" ");
        int nextsum = a+b ;
        a = b ;
        b = nextsum;
                    

            
        }
    }
}