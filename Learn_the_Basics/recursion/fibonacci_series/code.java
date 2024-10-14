package Learn_the_Basics.recursion.fibonacci_series;import java.util.*;

class code {

    //METHOD 1
    
    public static void fibonacci1(int n){
        int[] num = new int[n];
        if(n<=1){
            System.out.print(n);
        }
        else{
            num[0]=0;
            num[1] = 1;
            for(int i=2;i<n;i++){
                num[i] = num[i-1]+num[i-2];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
    }

    //METHOD 2

    public static void fibonacci2(int n){
        if(n<=1){
            System.out.print(n);
        }
        else{
            int s = 0;
            int f = 1 ;
            for(int i=0;i<n;i++){
                int t = s+f;
                System.out.print(s+" ");
                s = f;
                f=t;
            }
        }
    }

    //METHOD 3
    public static int fibonacci3(int n){
        if(n<=1){
            return n;
        }
        
        return fibonacci3(n-1)+fibonacci3(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci3(i) + " ");  
        }
    }


}
