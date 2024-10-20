package sorting_technique;

public class quick_sort {
   
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int l,int h) {
        int i=l,j=h;
        int pivot = arr[l];
        do{
            do{i++;}while(i<h && arr[i]<=pivot);
            do{j--;}while(j>l && arr[j]>pivot);
            if(i<j){
                swap(arr,i,j);
            }
        }while(i<j);
        swap(arr,j,l);
        return j;
    }
    
    public static void quicksort(int[] arr,int l,int h) {
        int j;
        if(l<h-1){
            j=partition(arr,l,h);
            quicksort(arr,l,j);
            quicksort(arr,j+1,h);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 9, 7};
        quicksort(arr,0,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }


}
