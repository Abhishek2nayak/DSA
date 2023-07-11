package abhishek.Array.SubArray;

public class SlidingWindow {
    public static void main(String[] args) {
  int[] arr = {1,2,3,4,5,6,8,9};
        System.out.println(maxSum2(arr,3));
    }
    // to find maximum sum of consecutive subarray of size k

    //brute approach
    //find all the possible sum of size k
    public static int maxSum1(int[] arr, int k) {
        //base case
        if (k > arr.length) return -1;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - k + 1; i++) {
            int currSum = 0;
            for(int j = 0; j < k; j++) {
                currSum += arr[i + j];
            }
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }

    //using sliding window

    //in sliding window we create window of size k and slide the window in each iteration
    // we remove previous element and store the next element


    public static int maxSum2(int[] arr , int k) {

        //finding the initial window of size k
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;

        int windowSum = sum;
        for (int i = k; i < arr.length; i++) {
            windowSum  += arr[i] - arr[i - k];
            maxSum = Math.max(windowSum,maxSum);
        }
        return maxSum;
    }
}
