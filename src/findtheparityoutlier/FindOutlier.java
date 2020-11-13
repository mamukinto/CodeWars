package findtheparityoutlier;

///////////////////////////////////////////////////////////////////////////
// https://www.codewars.com/kata/5526fc09a1bbd946250002dc
///////////////////////////////////////////////////////////////////////////

public class FindOutlier {
    static int find(int[] integers){
        int first = integers[0];
        int second = integers[1];
        int third = integers[2];
        int res = 0;

        if ((isEven(first) && isEven(second)) || (isEven(second) && isEven(third)) || (isEven(first) && isEven(third))) {
            for (int integer : integers) {
                if (!isEven(integer)) {
                    res = integer;
                }
            }
        } else {
            for (int integer : integers) {
                if (isEven(integer)) {
                    res = integer;
                }
            }
        }

        return res;
    }

    private static boolean isEven(int number) {
        return number%2 == 0;
    }
}
