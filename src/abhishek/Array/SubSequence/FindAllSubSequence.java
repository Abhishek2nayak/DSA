package abhishek.Array.SubSequence;

import java.util.ArrayList;

public class FindAllSubSequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ArrayList<Integer> list = new ArrayList<>();
   printSubSequence(arr,list,0);

    }

    //using recursion
    public static void printSubSequence(int[] arr, ArrayList<Integer> list,int idx) {
        //base case
        if (arr.length == idx) {
            System.out.println(list);

        } else {
            //include

            printSubSequence(arr,list,idx + 1);
            list.add(arr[idx]);
            printSubSequence(arr,list,idx + 1);
            //removing last element store in list
            list.remove(list.size() -1);

        }

    }
    //store in 2d array list

}
