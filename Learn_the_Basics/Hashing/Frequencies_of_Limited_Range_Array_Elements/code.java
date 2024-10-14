package Learn_the_Basics.Hashing.Frequencies_of_Limited_Range_Array_Elements; 
import java.util.*;

class code {

    
    public static void frequencyCount(int arr[], int N) {
        HashMap<Integer,Integer> hm  = new HashMap<>();
        for(int i=0;i<N;i++){
            if(arr[i]<=N){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                int val = hm.get(arr[i]);
                hm.put(arr[i],val+1);
            }
            }
        }
        
        for(int i=0;i<N;i++){
            if(!hm.containsKey(i+1)){
                arr[i] =0;
            }
            else{
                int val = hm.get(i+1);
                arr[i] = val;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        frequencyCount(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }


}
