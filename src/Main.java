import utl.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 10, 8, 7, 10, 2, 38, 38, 49, 49, 38};
        System.out.println("1nd max (1): " + MaxUtl.maxMethod1(arr));
        System.out.println("1nd max (2): " + MaxUtl.maxMethod2(arr));
        System.out.println("2nd max (1): " + MaxUtl.max2ndMethod1(arr));
        System.out.println("2nd max (2): " + MaxUtl.max2ndMethod2(arr));

        System.out.println("========================");

        String str = "HHHello welcome to VietNam! 123";
        int[] counts = VowelConsonantCountUtl.countVowelAndConsonant(str);
        System.out.println("Vowel count: " + counts[0]);
        System.out.println("Consonant count: " + counts[1]);

        System.out.println("========================");

        int[] missArr = {1, 2, 3, 6, 5, 7, 8, 9, 10};
        System.out.println("Miss element (1): " + MissingNumberUtl.missingNumberMethod1(missArr, 10));
        System.out.println("Miss element (2): " + MissingNumberUtl.missingNumberMethod2(missArr, 10));

        System.out.println("========================");

        int[] duplicateArr = {1, 2, 3, 2, 3, 5, 6, 7, 0, 1, 1, 1};
        System.out.print("Duplicate number (1): ");
        DuplicateNumberUtl.findDuplicateNumberMethod1(duplicateArr);
        System.out.print("\r\nDuplicate number (2): ");
        DuplicateNumberUtl.findDuplicateNumberMethod2(duplicateArr);

        System.out.println("========================");

        int[] mixArr = {1, 2, 4, 6, 5, 7, 9, 8, 12};
        System.out.println("Minimum moves to separate even numbers and odd numbers: " + MinimumMoveUtl.minimumMoves(mixArr));
    }
}