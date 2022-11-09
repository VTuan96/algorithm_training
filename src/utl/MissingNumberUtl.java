package utl;

import java.math.BigInteger;

public class MissingNumberUtl {
    /*
    * We have an array from 1 to n. However, there is 1 missing element from this array
    * We have to find the missing element from this array
     */


    /*
    * Method 1:
    * As you know we have calculation formula to calculate the sum of an array
    * from 1 to n: sum(array) = n*(n+1)/2
    * We will use this formula to find the missing element
    *
     */
    public static int missingNumberMethod1(int[] arr, int n) {
        int length = arr.length;
        int sumOfFullArray = n * (n + 1) / 2;
        int sumOfArray = 0;

        for (int i = 0; i < length; i++) {
            sumOfArray += arr[i];
        }

        return (sumOfFullArray - sumOfArray);
    }


    /*
     * Method 2: Using XOR operator
     * Principle XOR:
     * A ^ A = 0
     * A ^ 0 = A
     * We will use this principle of XOR to find the missing element
     *
     */
    public static int missingNumberMethod2(int[] arr, int n) {
        int xorArr = arr[0];
        int xorFullArr = 1;

        int length = arr.length;

        for (int i = 1; i <= n; i++) {

            // XOR operation on all elements of arr
            if (i < length)
                xorArr ^= arr[i];

            // XOR operation on all elements from 2 to n because xorFullArr is initialized as 1
            if (i > 1)
                xorFullArr ^= i;
        }

        return (xorArr ^ xorFullArr);
    }
}
