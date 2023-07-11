package abhishek.Utility;

public class Sort {
    public static void sort(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

    }
}
