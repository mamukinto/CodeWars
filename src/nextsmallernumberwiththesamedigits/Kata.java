package nextsmallernumberwiththesamedigits;

import java.util.*;

public class Kata {
    public static long nextSmaller(long n){
        LinkedList<Long> digits = new LinkedList<>();
        int countDigits = (int) (Math.floor(Math.log10(Math.abs(n))) + 1);


        for (int i = 0; i < countDigits; i++) {
            digits.addFirst((n%10));
            n /= 10;
        }

        boolean flag = false;

        for (int i = 1; i < digits.size(); i++) {
            if (digits.get(digits.size() - i) < digits.get(digits.size() - (i+1))) {
                swap(digits,digits.size() - i, digits.size() - (i+1));
                flag = true;
                break;
            }
        }
        if (!flag || digits.getFirst() == 0) {
            return -1;
        }

        return fromListToInt(digits);
    }
    private static int fromListToInt(List<Long> list) {
        StringBuilder sb = new StringBuilder();
        list.forEach(sb::append);
        return Integer.parseInt(sb.toString());
    }

    private static void swap(LinkedList<Long> digits,int firstIndex,int secondIndex) {
        Long temp = digits.get(firstIndex);
        digits.set(firstIndex,digits.get(secondIndex));
        digits.set(secondIndex,temp);
    }



    public static void main(String[] args) {

        //[TODO] unfinished kata combinatorics permutations and things like that 4kyu
        // - Next smaller number with the same digits :)
    }
}
