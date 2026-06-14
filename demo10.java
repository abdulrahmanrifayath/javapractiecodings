import java.util.*;
public class demo10{
    public static void main(String[] args){
        System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==1 && a%7==0 && a%9==0){
            System.out.println("VSB");
        }
        else if(a%2==1 && a%3==0 && a%5==0){
            System.out.println("CBE");
        }
        else if(a%2==0 && a%4==0 && a%12==0){
            System.out.println("HI");
        }
        else if(a%2==0 && a%3==6 && a%5==9){
            System.out.println("HELLO");
        }
        else{
            System.out.println("BYE");
        }
    }
}