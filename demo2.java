import java.util.*;
public class demo2 {
    public static void main(String[] args) {
        //find largest among 5 values
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int a = sc.nextInt();
        System.out.print("enter a number:");
        int b = sc.nextInt();
        System.out.print("enter a number:");
        int c = sc.nextInt();
        System.out.print("enter a number:");
        int d = sc.nextInt();
        System.out.print("enter a number:");
        int e = sc.nextInt();

        if(a>b && a>c && a>d && a>e){
            System.out.println(a);
        }
        else if(b>a && b>c && b>d && b>e)
        {
            System.out.println(b);
        }
        else if(c>a && c>b && c>d && c>e)
        {
            System.out.println(c);
        }
        else if(d>a && d>b && d>c && d>e)
        {
            System.out.println(d);
    
        }
        else
        {System.err.println(e);}
    }
}
