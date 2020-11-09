package vowelcount;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] chars = str.toCharArray();

        for (char char1 : chars) {
            if (char1 == 'a' | char1 == 'e' | char1 == 'i' | char1 == 'o' | char1 == 'u') {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
