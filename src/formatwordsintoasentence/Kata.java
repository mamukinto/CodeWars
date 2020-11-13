package formatwordsintoasentence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

///////////////////////////////////////////////////////////////////////////
// https://www.codewars.com/kata/51689e27fe9a00b126000004/train/java
///////////////////////////////////////////////////////////////////////////

public class Kata {
    public static String formatWords(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        if (words.length == 1) {
            return  words[0];
        }

        StringBuilder result = new StringBuilder();
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        List<String> wordsList1 = new ArrayList<>(Arrays.asList(words));


        wordsList.removeIf(s -> s.equals(""));
        for (int i = 0; i < wordsList.size(); i++) {
            result.append(wordsList.get(i));
            if (i == wordsList.size() - 2) {
                result.append(" and ");
                result.append(wordsList.get(i + 1));
                break;
            }
            else if (i != wordsList.size() - 1) {
                result.append(", ");
            }
        }
        System.out.println("INPUT: " + wordsList1 + " \nresult: " + result + "\n\n");
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(formatWords(new String[]{"","ana"}));
    }
}
