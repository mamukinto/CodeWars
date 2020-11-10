package multiplesof3or5;

import java.util.*;

public class Solution {
    public static int solution(int number) {
        LinkedList<Integer> fives = new LinkedList<>();
        LinkedList<Integer> threes = new LinkedList<>();

        for (int i = 1; i <= number; i++) {
            if (3 * i >= number) {
                break;
            }
            fives.addFirst(3 * i);
            System.out.print(fives);
        }
        for (int i = 0; i <= number; i++) {
            if (5 * i >= number) {
                break;
            }
            threes.addFirst(5 * i);
            System.out.println(threes);
        }
        Set<Integer> set = new LinkedHashSet<>(threes);
        set.addAll(fives);
        List<Integer> combinedList = new ArrayList<>(set);
        return combinedList.stream().mapToInt(xutiani -> xutiani).sum();
    }

}
