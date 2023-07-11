package abhishek.Array.SubSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FindAllSubsets {
    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    int[] arr = {1,2,3};
//    allSubSets(arr,0,list,new ArrayList<>());
        subsets(arr,0,list,new ArrayList<>());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    public static void allSubSets(int[] arr, int idx,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> output) {
        //base condition
        if(arr.length == idx) {
            list.add(output);
            return;
        }
        //not contain
        allSubSets(arr,idx + 1,list,new ArrayList<>(output));
      if(!output.isEmpty())  {
          output.add(arr[idx]);
      }
        allSubSets(arr,idx + 1,list,new ArrayList<>(output));
    }
    public static void subsets(int[] arr, int idx, ArrayList<ArrayList<Integer>> list,ArrayList<Integer> output) {
        //base condition
        if(idx == arr.length) {
            list.add(output);
            return;
        }

        output.add(arr[idx]);

        subsets(arr,idx + 1,list,new ArrayList<>(output));
        //backtrack

        output.remove(output.size()-1);


        subsets(arr,idx + 1,list,new ArrayList<>(output));

    }
}
