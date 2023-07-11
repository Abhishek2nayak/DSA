package abhishek.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
    int[] arr = {3,4,51,3,0};
    quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void quickSort(int[] arr, int low, int high) {

        //base case
        if(low < high) {
            int pi = partition(arr,low,high);
           //left
            quickSort(arr,low,pi -1);
            //right
            quickSort(arr,pi + 1,high);

        }


    }
    public static int partition(int[] arr, int low, int high) {
     int pivot = arr[high];
     int idx = low - 1;
        for (int i = low; i <high ; i++) {
          if(arr[i] < pivot) {
              idx++;
              swap(arr,i,idx);
          }
        }
        swap(arr,idx+1,high);
        return idx + 1;

    }
}
