package abhishek.Array.leetcode;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        //sort color
        //0 : red, 1 : blue , 2 : green
        int[] colors = {2,0,2,1,1,0};
        byCountFrequency(colors);

        System.out.println(Arrays.toString(colors));

    }
//brute approach
//    sort array
    public  static void sortArray(int[] colors) {
        Arrays.sort(colors);
    }
    // count the frequency of 0 and 1 and 2
    public static void byCountFrequency(int[] colors) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int color : colors) {
            if(color == 0) zero++;
            if(color == 1) one++;
            if(color == 2) two++;

        }
        int idx = 0;
        while(idx < colors.length) {
            if(zero >= 1) {
                colors[idx] = 0;
                zero--;
            } else if (one >= 1) {
                colors[idx] = 1;
                one--;
            } else {
                colors[idx] = 2;
                two--;
            }

            idx++;
        }


    }
}
