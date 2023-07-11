package abhishek.BitManipulation;

public class BitWiseAndOfGivenRange {
    public static void main(String[] args) {
        System.out.println(andOfGivenRange(5,7));
    }


    //In this Algo
    // we have to find and of number of range left to right
    // range 5 - 7
    // 5 : 1 0 1
    // 6 : 1 1 0
    // 7 : 1 1 1
    // -----------
    //    :1 0 0
    //since both the number are different we can say that it contains a middle number
    // having  value 0
    // so, we have to find that number where left and right both are equal
    // to do so we have right shift the both left and right number by position 1
    // and also maintain count of operaion
    // after right shift by two time : left : 0 0 1 , right : 0 0 1
    // know both the number are equals so we have to left shift the number by count of
    // 0 0 1 << 2 : 1 0 0 :=> 4 ans.



    public static int andOfGivenRange(int left, int right) {
       int i = 0;
       for (; left != right; ++i) {
           left >>=1;
           right >>=1;

       }
       return right << i;
    }
}
