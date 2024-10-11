package DSA_Striver_A_to_Z.Basics_math.recursion.reverse_an_array;
import java.util.*;

class code {
    public static void reverse(int arr[], int start, int end) {
        if (start > end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
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

        // Call the static reverse method
        reverse(arr, 0, arr.length - 1);

        // Output the reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
