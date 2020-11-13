package romannumeralsencoder;

import java.util.LinkedHashMap;
import java.util.Map;


///////////////////////////////////////////////////////////////////////////
// https://www.codewars.com/kata/51b62bf6a9c58071c600001b/
///////////////////////////////////////////////////////////////////////////

public class Conversion {
    public static String solution(int n) {
        StringBuilder result = new StringBuilder();
        LinkedHashMap<String, Integer> table = new LinkedHashMap<>();
        table.put("M", 1000);
        table.put("CM", 900);
        table.put("D", 500);
        table.put("CD", 400);
        table.put("C", 100);
        table.put("XC", 90);
        table.put("L", 50);
        table.put("XL", 40);
        table.put("X", 10);
        table.put("IX", 9);
        table.put("V", 5);
        table.put("IV", 4);
        table.put("I", 1);

        for (Map.Entry<String,Integer> pair : table.entrySet()) {
            while (n / pair.getValue() != 0) {
                n -= pair.getValue();
                result.append(pair.getKey());
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1666; i++) {
            System.out.println("arabic: " + i + " - roman: " + solution(i));
        }
//        solution(1);
    }
}
