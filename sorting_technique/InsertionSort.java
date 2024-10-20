package sorting_technique;

public class InsertionSort {

    // Function to perform insertion sort
    public void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                // Swap arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
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
        InsertionSort ob = new InsertionSort();
        int arr[] = { 12, 11, 13, 5, 6 };
        int n = arr.length;

        System.out.println("Original array:");
        ob.printArray(arr, n);

        // Perform insertion sort
        ob.insertionSort(arr, n);

        System.out.println("Sorted array:");
        ob.printArray(arr, n);
    }
}
