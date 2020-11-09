package descedningorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// LINK FOR THE KATA DOWN BELOW :)
//
//  https://www.codewars.com/kata/5467e4d82edf8bbf40000155
//
//

public class DescendingOrder {
    public static int sortDesc(final int num) {
        // variables
        List<Integer> numbers = new ArrayList<>();
        int tempNum = num;
        int result = 0;
        int length = 0;
        long temp = 1;

        //number of digits in num
        while (temp <= num) {
            length++;
            temp *= 10;
        }

        // from int to list
        for (int i = 0; i < length; i++) {
            numbers.add(tempNum%10);
            tempNum = tempNum/10;
        }


        // sort
        numbers.sort(Collections.reverseOrder());

        // from list to int
        for (Integer integer : numbers) {
            result = result * 10 + integer;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(1012));
    }
}
