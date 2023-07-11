package abhishek.Sorting;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
   int[] arr = {3,4,51,2,1,5};
   sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr) {
     int n = arr.length;
     //convert arr into maxheap 
        for (int i = n/2 -1; i >=0; i--) {
            heapify(arr,n,i);
        }
        
        //remove root node and place it at last
        for (int i = n-1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }

    }
    public static void heapify(int[] arr,int n, int idx) {
        int largest = idx; //let suppose our root node is greatest element
        int left = 2 * idx + 1; //left node
        int right = 2 * idx + 2; //right node
        //check if our child is greater than root node

        if(left < n && arr[largest] < arr[left]) largest = left;
        if(right < n && arr[largest] < arr[right]) largest = right;
        //check if our largest in not our root node
        if(largest != idx) {
            //swap the node 
            int temp = arr[largest];
            arr[largest] = arr[idx];
            arr[idx] = temp;
            //recursively call the heapify for other node
            heapify(arr,n,largest);
        }
    }
}
