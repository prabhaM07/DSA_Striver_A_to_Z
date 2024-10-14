package Learn_the_Basics.recursion.palindrome_or_not;
import java.util.*;

public class code {
    /*
     METHOD 1
  
    public static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char l= s.charAt(i);
            char r= s.charAt(j);
            if(l!=r){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
    */
    // METHOD 2 using recursion

    public static boolean isPalindrome(String s,int i,int j) {
        if(i>=j){
            return true;
        }
        char l=s.charAt(i);
        char r=s.charAt(j);
        if(l!=r){
            return false;
        }
        return isPalindrome(s,i+1,j-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s,0,s.length()-1));
    }

    /* 
    METHOD 3

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
            */
            
}
