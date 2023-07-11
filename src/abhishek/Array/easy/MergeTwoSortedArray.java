package abhishek.Array.easy;

import java.util.Arrays;


public class MergeTwoSortedArray {
    public static void main(String[] args) {
   int[] arr1 = {4,5,6,0,0,0};
   int[] arr2 = {1,2,3};
//        System.out.println(Arrays.toString(mergeArray(arr1,arr2)));
        merge(arr1,3,arr2,3);

    }
    //using extra space
    public static int[] mergeArray(int[] arr1,int [] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] ans = new int[m + n];
        int i =0;
        int j = 0;
        int idx = 0;
        while(i < n || j < m) {
            if(i < n && j < m) {
                if(arr1[i] < arr2[j]) {
                    ans[idx] = arr1[i];
                    i++;
                } else {
                    ans[idx] = arr2[j];
                    j++;
                }

             } else if(i < n) {
                ans[idx] = arr1[i++];
            } else {
                ans[idx] = arr2[j++];
            }

            idx++;
        }
            return ans;
    }
    //without using extra space
    public static void merge(int[] arr1, int m, int[] arr2, int n)  {
        int i = 0;
        int j = 0;

        while(i < m && j < n) {
            if(arr1[i] > arr2[j]) {
                //swap
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                int idx = j;

                while(idx < n - 1 && arr2[idx] > arr2[idx + 1] ) {
                    //sort the array 2
                    temp = arr2[idx];
                    arr2[idx] = arr2[idx + 1];
                    arr2[idx + 1] = temp;
                    idx++;

                }

            }
            i++;

        }

        while (j < n) {
            arr1[i] = arr2[j];
            i++;
            j++;
        }

    }





}
