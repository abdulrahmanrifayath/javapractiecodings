import java.util.*;
public class demo22{
    public static void main(String[] args){
        System.out.println("enter the value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = 'A';
        for(int i=0; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(c+" ");
            }
            System.out.println();

              c++;
        }
      
    }
}