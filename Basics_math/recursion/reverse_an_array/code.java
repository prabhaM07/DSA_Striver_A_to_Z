package DSA_Striver_A_to_Z.Basics_math.recursion.reverse_an_array;
import java.util.*;

class code {

    //METHOD 1

    public static void reverse(int arr[], int start, int end) {
        if (start > end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }

    //METHOD 2

    public static int[] reverseArray(int arr[]) {
        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        // Reverse the list
        Collections.reverse(Arrays.asList(boxedArray));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = boxedArray[i];
        }
        return arr;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        // Reading array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Call the static reverse method 2
        int[] ans = reverseArray(arr);


        // Output the reversed array
        System.out.println("Reversed array: " + Arrays.toString(ans));
    }
}
