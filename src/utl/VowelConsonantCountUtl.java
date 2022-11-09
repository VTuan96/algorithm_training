package utl;

public class VowelConsonantCountUtl {
    public static int[] countVowelAndConsonant(String str) {
        int countVowel = 0;
        int countConsonant = 0;
        int [] counts = new int[2];

        int length = str.length();

        //convert str to lowercase
        str = str.toLowerCase();

        for (int i = 0; i < length; i++) {
            if (
                    str.charAt(i) == 'a' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'u' ||
                    str.charAt(i) == 'o'
            ) {
                countVowel++;
            }
            else if (
                    str.charAt(i) > 'a' &&
                    str.charAt(i) <= 'z'
            ) {
                countConsonant++;
            }
        }

        counts[0] = countVowel;
        counts[1] = countConsonant;

        return counts;
    }
}
