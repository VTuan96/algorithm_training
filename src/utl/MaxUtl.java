package utl;

import java.util.*;

public class MaxUtl {

    /* Find max element from an array
    * Method 1: Using sort() on Arrays
    * Then select last element from array
     */
    public static int maxMethod1(int[] arr) {
        // Sort array
        Arrays.sort(arr);

        // Fetch max element
        return arr[arr.length - 1];
    }

    /* Find max element from an array
     * Method 2: Manually find max element by compare with each other element from array
     */
    public static int maxMethod2(int[] arr) {
        int max = arr[0];
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // Get 2nd max element from sorted array
    public static int max2ndMethod1(int[] arr) {
        int length = arr.length;

        if (length < 2) return -1;

        /*
         * sort array -> we have 2 solutions:
         * S1: we can use sort() from Arrays
         * S2: we manually sort using sort algorithm
         */


        // S1: we can use sort() from Arrays
        // Filter duplicate element from array
        Arrays.sort(arr);
        List<Integer> filterArr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (!filterArr.contains(arr[i])) {
                filterArr.add(arr[i]);
            }
        }

/*
        // S2: we manually sort using sort algorithm
        // Filter duplicate element from array
        List<Integer> filterArr = new ArrayList<>();
        int temp;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            if (!filterArr.contains(arr[i])) {
                filterArr.add(arr[i]);
            }
        }
*/
        return filterArr.get(filterArr.size() - 2);
    }

    // Using 2 temporary variables: 1st max and 2nd max element
    public static int max2ndMethod2(int[] arr) {
        int max1st = arr[0];
        int max2nd = -1;
        int length = arr.length;

        if (length < 2) return -1;

        for (int i = 1; i < length; i++) {
            if (arr[i] > max1st) {
                max2nd = max1st;
                max1st = arr[i];
            }
            else if ((arr[i] > max2nd) && (arr[i] != max1st)) {
                max2nd = arr[i];
            }
        }

        return max2nd;
    }
}
