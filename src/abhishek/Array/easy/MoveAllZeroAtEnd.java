package abhishek.Array.easy;

import java.util.Arrays;

public class MoveAllZeroAtEnd {
    public static void main(String[] args) {
    int[] arr = {0,0,1,3,4,0};
    moveZero1(arr);
        System.out.println(Arrays.toString(arr));
    moveZero2(arr);
        System.out.println(Arrays.toString(arr));
    }

    //brute approach
    public static void moveZero1(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n -1; i++) {
            if (arr[i] == 0) {
                //finding next non zero element
                int j = i + 1;
                while(j < n && arr[j] == 0) {
                    j++;
                }

                //swap the element
                if(j < n) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }


//    time Complexity : O (n * n)
    public static void moveZero2(int[] arr) {
        int n = arr.length;
        int j = 0;
        int count = -1;
        for(int i = 0; i < n -1; i++) {
            if (arr[i] == 0) {
                //finding next non zero element
                if (count == -1) {
                    count++;
                    j = i + 1;

                }
                while(j < n && arr[j] == 0) {
                    j++;
                }

                //swap the element
                if(j < n) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;

            }
        }
//        time complexity : O(N)

    }
}
