package abhishek.Array.SubSequence;

import java.util.ArrayList;

public class LongestSubSequenceWithEqual01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1,1,0,0,1,0,1,1,1};
//        System.out.println(longestSubSeq(arr,0,0,list));
        System.out.println(longestSubSequenceOP(arr));

    }
    //brute approach to solve this problem is to find all the subsequence of arr ,
    // and check no of zeros and ones in each subsequence
    public static int longestSubSeq(int[] arr , int max, int idx , ArrayList<Integer>list) {
       if(arr.length == idx) {
           if(list.size() > 0) {
               boolean isEqual = check(list);
               if (isEqual) {
                   if(max < list.size())  {
                    max = list.size();
                   }

               }
           }
       } else {
           max =  longestSubSeq(arr,max,idx + 1,list);
           list.add(arr[idx]);
           max =  longestSubSeq(arr,max,idx + 1 , list);
           list.remove(list.size() -1);

       }
        return max;

    }

    public static boolean check(ArrayList<Integer> list) {
        int zero = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 0) {
                zero++;
            }
        }
        if (list.size() == zero) return true;
        return false;
    }

    //optimize solution  : to count no of zero and one and return min(zero,one)
    public static int longestSubSequenceOP(int[] arr) {
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            }
        }

        return Math.min(zero,arr.length - zero);
    }
}
