import java.util.*;
public class demo21{
    public static void main(String[] args){
        System.out.print("enter the value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            char c = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(c+" ");
                c++;
            }
        System.out.println();
        }

    }
}