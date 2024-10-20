package sorting_technique;

public class MergeSort {

    // Function to merge two subarrays of arr[]
    void merge(int arr[], int l, int m, int r) {
        int i = l;      // Initial index of the first subarray
        int k = m + 1;  // Initial index of the second subarray
        int t = 0;      // Initial index for the merged array
        int[] ans = new int[r - l + 1]; // Temporary array to store the merged result

        // Merge the two halves into ans[]
        while (i <= m && k <= r) {
            if (arr[i] < arr[k]) {
                ans[t] = arr[i];
                i++;
            } else {
                ans[t] = arr[k];
                k++;
            }
            t++;
        }

        // Copy the remaining elements of the first half, if any
        while (i <= m) {
            ans[t] = arr[i];
            i++;
            t++;
        }

        // Copy the remaining elements of the second half, if any
        while (k <= r) {
            ans[t] = arr[k];
            k++;
            t++;
        }

        // Copy the merged elements back into the original array
        for (i = 0, t = l; i < ans.length; i++, t++) {
            arr[t] = ans[i];
        }
    }

    // Recursive function to perform merge sort
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            // Recursively sort the two halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // Function to print the array
    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort ob = new MergeSort();
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        System.out.println("Original array:");
        ob.printArray(arr, n);

        // Perform merge sort
        ob.mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        ob.printArray(arr, n);
    }
}
