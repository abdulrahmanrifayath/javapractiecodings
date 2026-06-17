import java.util.*;
public class demo18{
    public static void main(String[] args) {
        System.out.print("Enter the text:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        for (int i=0; i<s.length(); i++){
            boolean flag = true;
            for(int j =0; j<n; j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(s.charAt(i));
            }
        }
    }
}