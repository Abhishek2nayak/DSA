package abhishek.Array.Algorithm;

import java.util.Arrays;

import static abhishek.Utility.Sort.sort;

public class DutchFlag {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        dutchFlag(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void dutchFlag(int[] arr) {
        int l = 0;
        int m = 0;
        int h = arr.length -1;
        while(m <= h) {
            switch(arr[m]) {
                case 0 : sort(arr,l, m); l++; m++; break;
                case 1 : m++; break;
                case 2: sort(arr,m,h);h--; break;
            }
        }
    }

}
