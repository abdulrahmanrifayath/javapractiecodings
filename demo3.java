import java.util.*;
public class demo3{
    public static void main(String[] args) {
        System.out.println("Enter your mark 1:");
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int marks = (mark1+mark2+mark3)/3;
        if(marks>90)
        {System.out.println("A");}
        else if(marks>=80 && marks<=90){
            System.out.println("B");
        }
        else if(marks>=70 && marks<=80){
            System.out.println("C");
        }
        else if(marks>=60 && marks<=70){
            System.out.println("D");
        }
        else{
            System.out.println("E");


    }
    }
}