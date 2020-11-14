package perfectpower;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

///////////////////////////////////////////////////////////////////////////
// https://www.codewars.com/kata/54d4c8b08776e4ad92000835
///////////////////////////////////////////////////////////////////////////

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        List<Integer> resultList = new ArrayList<>();
        boolean isPerfect = false;
        int iterations = n;
        if (n > 300) {
            iterations = 300;
        }


        for (int i = 1; i < iterations; i++) {

            if (((float) (log(n) / log(i)) % 1 == 0)) {
                resultList.add(i);
                resultList.add((int) Math.round(log(n) / log(i)));
                System.out.println(n + "/" + i);
                isPerfect = true;
                break;
            }
        }

        if (!isPerfect) return null;

        int[] result = new int[resultList.size()];
        Arrays.setAll(result, resultList::get);

        return result;
    }

    private static double log(int n) {
        return Math.log(n);
    }

    public static void main(String[] args) {
//        isPerfectPower(2);
//        System.out.println((float) (log(125) / log(5)));
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            isPerfectPower(i);
        }
    }
}
