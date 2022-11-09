package utl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumberUtl {

    public static void findDuplicateNumberMethod1(int[] arr) {
        int length = arr.length;

        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();

        for (int i = 0; i < length; i++) {
            if (!uniqueSet.contains(arr[i])) {
                uniqueSet.add(arr[i]);
            }
            else {
                duplicateSet.add(arr[i]);
            }
        }

        for (Integer integer : duplicateSet) {
            System.out.print(integer + " ");
        }
    }


    public static void findDuplicateNumberMethod2(int[] arr) {
        int length = arr.length;
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j])
                    duplicates.add(arr[i]);
            }
        }

        for (Integer integer : duplicates) {
            System.out.print(integer + " ");
        }
    }
}

