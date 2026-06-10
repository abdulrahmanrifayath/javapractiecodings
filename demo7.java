
import java.util.*;
public class demo7{
    public static void main(String[] args){
        System.out.println("Enter the value");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int temp=num;
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        int FirstDigit = (int) (temp/Math.pow(10,(count-1)));
        int LastDigit = temp%10;
        int MidValue = (int) (temp%Math.pow(10,count-1))/10;
        System.out.println(FirstDigit);
        System.out.println(LastDigit);
        System.out.println(MidValue);
        int rev=(int) (LastDigit*Math.pow(10,count-1))+(MidValue*10)+FirstDigit;
        System.out.println(rev);
    }
}