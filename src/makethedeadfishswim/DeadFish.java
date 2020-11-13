package makethedeadfishswim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

///////////////////////////////////////////////////////////////////////////
// https://www.codewars.com/kata/51e0007c1f9378fa810002a9
///////////////////////////////////////////////////////////////////////////

public class DeadFish {
    public static int[] parse(String data) {
        List<Integer> resultList = new ArrayList<>();
        List<String> input = new ArrayList<>();
        int temp = 0;

        for (int i = 0; i < data.length(); i++) {
            input.add(String.valueOf(data.charAt(i)));
        }

        for (String s : input) {
            switch (s) {
                case "i":
                    temp++;
                    break;
                case "d":
                    temp--;
                    break;
                case "s":
                    temp = (int) Math.pow(temp, 2);
                    break;
                case "o":
                    resultList.add(temp);
                    break;
            }
        }

        return convertIntegers(resultList);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiioiissoqqiiso")));
    }

    private static int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i);
        }
        return ret;
    }
}
