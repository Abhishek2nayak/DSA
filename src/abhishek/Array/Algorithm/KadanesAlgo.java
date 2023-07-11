package abhishek.Array.Algorithm;

/* In Kadane's Algorithm
 take two variable
 1 : max_sum_sofar
 2 : max_ending_here
 Loop each element in array
  -> calc sum till that point max_ending_here += arr[i]
  -> check if max_sum_so_far < max_ending_here
    -> max_so_far = max_ending_here
  -> check if max_ending_here < 0
    -> max_ending_here = 0
  return max_sum

* */



public class KadanesAlgo {
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(maxSum(a));
    }
    public static int maxSum(int[] arr ) {
        int n = arr.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here +=arr[i];
            if(max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if(max_ending_here < 0) {
                max_ending_here = 0;
            }

        }
        return max_so_far;
    }
}
