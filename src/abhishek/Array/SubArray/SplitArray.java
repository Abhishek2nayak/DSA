package abhishek.Array.SubArray;

/*Given an array of integers greater than zero,
 find if it is possible to split it in two subarrays (without reordering the elements), such that the
 sum of the two subarrays is the same. Print the two subarrays.
*
* */
public class SplitArray {
    public static void main(String[] args) {

        int[] arr ={ 1 , 2 , 3 , 4 , 5 , 5  };
        System.out.println(isSplitArrayEqual(arr,arr.length));

    }
    public static boolean isSplitArrayEqual(int[] arr, int n) {
        // first we find the total sum of array
        int tsum = 0;
        for (int i = 0; i < n; i++) {
            tsum += arr[i];
        }
        //now for each iteration we check left sum and right sum
        int lsum = 0;
        for (int i = 0; i < n; i++) {
            lsum += arr[i];
            tsum -= arr[i];
            if(lsum == tsum) return true;
        }
        return false;

    }
}
