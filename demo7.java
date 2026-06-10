
import java.util.*;
public class demo7{
    public static void main(String[] args){
        System.out.println("Enter the value");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println(count);
    }

}