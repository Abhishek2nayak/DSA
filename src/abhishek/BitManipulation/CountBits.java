package abhishek.BitManipulation;

import java.util.Arrays;

public class CountBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(count(5)));
    }

    static int[] count(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int cnt = 0;
            for (int j = 0; j < 32; j++) {
                int bit = 1 << j;
                if ((bit & i) != 0) cnt++;
            }
            arr[i] = cnt;
        }
        return arr;
    }
}
