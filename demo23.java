import java.util.*;
public class demo23{
    public static void main(String[] args){
        System.out.print("enter the value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//1st for loop is used for row
        for(int i=1;i<=n;i++){
            //2nd loop is used for space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //3rd loop is for increment
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            //fourth loop is for decrement
            for(int l=i-1; l>=1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}