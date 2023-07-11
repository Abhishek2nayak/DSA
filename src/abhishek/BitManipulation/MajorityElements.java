package abhishek.BitManipulation;

public class MajorityElements {
    public static void main(String[] args) {
    int[] nums = {2,3,4,4,4};
        System.out.println(usingBoyerMooreVotingAlgo(nums));
        System.out.println(usingBitMani(nums));
    }
    //using Boyer's moore voting algorithm
//     Algo
//   it is used to find majority element having occurrence more than n/ 2 time
// it work like real voting system where most vote candidate wins
//    1> count = 0 : to count vote of candidate
//    2> candidate = null : Initially no candidate was selected
//    3> iterate over an array if count  = 0 select that candidate as new candidate
//     if candidate == num then increment count if not decrement count
//

    public static int usingBoyerMooreVotingAlgo(int[] nums) {
        int cnt = 0;
        Integer  candidate = null;
        for(int num : nums) {
            if(cnt == 0) candidate = num;
            cnt+= (num == candidate)?1 : -1;
        }
        return candidate;
    }

//    Using Bit Manipulation Approach
//    let suppose give arr is = [2,2,3]
//    its bits representation like this
//    1 0
//    1 0
//    1 1
//    -------
//    1 0
//    we can clearly see that at each level majority bit should be ans
//


    public static int usingBitMani(int[] nums) {
        int majority_element = 0;
        for (int i = 0; i < 32; i++) {
            //find the bit of ith position
            int bit = 1 << i;
            int bitCount = 0;
            for (int num :
                    nums) {
                //if my bit is setbit the increment count of bit
                if((num & bit) != 0) bitCount++;
            }

            //if my bitcount > num.length then we update over majority element using or operator
            if(bitCount > nums.length / 2) {
                majority_element |= bit;
            }
        }
        return majority_element;
    }
}
