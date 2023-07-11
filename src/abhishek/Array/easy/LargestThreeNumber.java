package abhishek.Array.easy;

import java.util.Arrays;

public class LargestThreeNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,5,0,1,9};
        System.out.println(Arrays.toString(largestThree(arr)));
    }
    public static int[] largestThree(int[] arr) {
        if (arr.length < 4) {
            int[] threeMax = {-1,-1,-1};
            return threeMax;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if(curr > max1) {
                max3 = max2;
                max2 = max1;
                max1 = curr;
            } else if (curr > max2) {
                max3 = max2;
                max2 = curr;
            } else if (curr > max3) {
                max3 = curr;
            }
        }

        int[] threeMax = {max1,max2,max3};
        return threeMax;

    }
}
