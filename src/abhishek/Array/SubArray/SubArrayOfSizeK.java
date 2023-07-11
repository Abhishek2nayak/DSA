package abhishek.Array.SubArray;

public class SubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1,4,2,10,2,3,1,0,20};
        int k = 4;
        int sum = 24;

        System.out.println(sumOfSizeK(arr,k,sum));
    }
    //using sliding window algorithm
    public static boolean sumOfSizeK(int[] arr, int k,int s) {
        //first we find sum of size k
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if(sum == s) return true;
        //now using sliding window we can solve
        int slideSum = sum;
        for (int i = k; i < arr.length; i++) {

            slideSum  = slideSum + arr[i] -arr[i - k];
//            System.out.println(slideSum);
            if(slideSum == s) return true;
        }
        return false;
    }
}
