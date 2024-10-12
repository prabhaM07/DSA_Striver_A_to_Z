package DSA_Striver_A_to_Z.Basics_math.recursion.palindrome_or_not;
import java.util.*;

public class code {
        public String processString(String s) {
            return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        }
    
        public void palindrome(String s,int i,StringBuilder ans){
            if(i<0){
                return;
            }
            ans.append(s.charAt(i));
            palindrome(s,i-1,ans);
        }
        public boolean isPalindrome(String s) {
            s = processString(s);
            StringBuilder ans = new StringBuilder();
            palindrome(s,s.length()-1,ans);
            return s.equals(ans.toString());
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            code solution = new code();
            boolean result = solution.isPalindrome(s);
            System.out.println(result);
            
        }
}
