package abhishek.Array.SubSets;

public class FindSubSetOfLengthKforSum0 {
    public static void main(String[] args) {
        int[] arr = {1,-1,-1,1,1,1};
        System.out.println(isAvailable(arr,2));
    }
    public static int count(int[] arr) {
        int ones = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) ones++;
        }
        return ones;
    }
    public static boolean isAvailable(int[] arr, int k) {
        int posOnes = count(arr);
        int negOnes = arr.length - posOnes;
        int min = 2 * Math.min(posOnes,negOnes);
        return min % k == 0;

    }
}
