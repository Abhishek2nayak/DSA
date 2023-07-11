package abhishek.Array.SubArray;

public class SubArrayWithGivenProduct {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,-5,8};
        System.out.println(isProductExist1(arr,-40)); //brut approach

        //optimize approach

    }

    //brut approach :
    //check all possible product of subarray

    public static boolean isProductExist1(int[] arr , int target) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = i ; j < arr.length; j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr[k];
                }
                if(prod == target) return true;
            }
        }
        return false;
    }


}
