package abhishek.Array.leetcode;

import java.util.Arrays;

/*Given an array arr of 4 digits, find the latest 24-hour time that can be made using each digit exactly once.

24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.

Return the latest 24-hour time in "HH:MM" format. If no valid time can be made, return an empty string.



Example 1:

Input: arr = [1,2,3,4]
Output: "23:41"
Explanation: The valid 24-hour times are "12:34", "12:43", "13:24", "13:42", "14:23", "14:32", "21:34", "21:43", "23:14", and "23:41". Of these times, "23:41" is the latest.
* */
public class LargestTimeForGivenDigit {
    public static void main(String[] args) {
        int[] arr = {3,4,5,0};
        System.out.println( largestTimeFromDigits(arr));
    }
    public static String largestTimeFromDigits(int[] arr) {
        String ans = "";
        int ihour = 0;
        int imin = 0;
        //find all possible times
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                //swap the adjacent element
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;


                if(isValidTime(arr)) {
                    //check the time is maximum of other
                    int hour = arr[0] * 10 + arr[1];
                    int min  = arr[2] * 10 + arr[3];

                    if (hour > ihour || (hour == ihour && min > imin)) {
                        ihour = hour;
                        imin = min;
                        ans  = ihour + ":" + imin;

                    }

                }
            }
        }


  if(ans.length() == 4) {
      ans = "0" + ans;
  }
        return ans;
    }

    //function to check the valid
    public static boolean isValidTime(int[] arr) {
        int hour = arr[0] * 10 + arr[1];
        int min  = arr[2] * 10 + arr[3];
        if(hour >= 24 || min >= 60) return false;
        return true;
    }
}
