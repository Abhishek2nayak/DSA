package abhishek.Array.SubArray;

public class LongestSubArrayWithDiff {
    public static void main(String[] args) {
    int[] arr = {1,4,5,6,10};
        System.out.println(longestSubArray(arr,20));
    }


    public static int longestSubArray(int[] arr , int k) {
     int i = 0;
     int j = 1;
     int sum = arr[i] ;
     int n = arr.length;
     int maxLength = 1;
     while(i < n && j < n) {
         sum += arr[j];
         int len = j - i + 1;
         int diffSum = len * arr[j] - sum;
         if (diffSum <= k ) {
            if(maxLength < len)  maxLength = len;
         } else {
             sum = sum - arr[i];
             i++;
         }
         j++;
     }
     return maxLength;

    }
}
