import java.util.*;
public class demo16{
    public static void main(String[] args) {
        System.out.println("Enter the text:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a'  || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("vowels count:"+vowels);
        System.out.println("consonants count:"+ consonants);
    }
}