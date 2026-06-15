import java.util.Scanner;
public class demo14{
    public static void main(String[] args){
        //getting input through array
        System.out.println("Enter the array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("ente the values: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The values are:");

        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}
