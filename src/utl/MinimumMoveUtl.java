package utl;

import java.util.ArrayList;
import java.util.List;

public class MinimumMoveUtl {

    /*
    * Minimum moves to separate even and odd numbers in array
    * Suppose you have an array of elements as 13, 10, 21, 20.
    * Now you need to find out minimum moves to segregate even
    * followed by odd elements in the Array so that all even elements
    * will be in the front of the array and all odd elements
    * will be in the back of the array.
    * So the resulting array will 20, 10, 21, 13.
    *
     */


    public static int minimumMoves(int[] arr) {
        int minimumMoves = 0;
        int length = arr.length;

        // We need to find all indexes of even numbers and total even numbers
        List<Integer> evenIndex = new ArrayList<Integer>();

        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 == 0) {
                evenIndex.add(i);
            }
        }

        int totalEvenNumbers = evenIndex.size();

        // All even numbers will be placed at left and before odd numbers in array
        // Because we have total 'totalEvenNumbers' even numbers.
        // So they will be placed from index 0 to 'totalNumberEvenNumbers' - 1
        // If one index from 'evenIndex' is not existed between 0 and 'totalNumberEvenNumbers' - 1,
        // we need to use swap once
        // Finally, swap times equals to total times of index from 'evenIndex' is not existed
        // between 0 and 'totalNumberEvenNumbers' - 1
        for (int i = 0; i < totalEvenNumbers; i++) {
            if (!evenIndex.contains(i)) {
                minimumMoves++;
            }
        }

        return minimumMoves;

    }
}
