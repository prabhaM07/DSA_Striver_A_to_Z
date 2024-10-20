package sorting_technique;

public class SelectionSort {

    // Function to perform selection sort
    void selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int ans = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[ans] > arr[j]) {
                    ans = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[ans];
            arr[ans] = arr[i];
            arr[i] = temp;
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
        SelectionSort ob = new SelectionSort();
        int arr[] = { 64, 25, 12, 22, 11 };
        int n = arr.length;

        System.out.println("Original array:");
        ob.printArray(arr, n);

        // Perform selection sort
        ob.selectionSort(arr, n);

        System.out.println("Sorted array:");
        ob.printArray(arr, n);
    }
}
