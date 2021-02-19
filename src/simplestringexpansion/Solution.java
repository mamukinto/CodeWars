package simplestringexpansion;

import java.util.Arrays;

public class Solution {
    public static String solve(String s) {
        StringBuilder input = new StringBuilder(s);
        StringBuilder sb = new StringBuilder();
        s = s.replace("("," ");
        s = s.replace(")"," ");
        String[] strings = s.split(" ");
        sb.append(strings[strings.length - 1]);

        System.out.println(Arrays.toString(strings));

        for (int i = strings.length - 1; i >= 0; i--) {
            String oldSB = sb.toString();
            System.out.println("oldSB = " + oldSB);
            sb = new StringBuilder(strings[i]);
            System.out.println("new sb = " + sb);
            String multi = sb.charAt(sb.length() - 1) + "";

            if (!isInteger(multi, 10) && i != strings.length - 1) {
                sb.append(oldSB);
            }

            if (isInteger(multi, 10)) {
                sb.deleteCharAt(sb.length() - 1);
                for (int j = 0; j < Integer.parseInt(multi); j++) {
                    sb.append(oldSB);
                    System.out.println("Appended : " + sb);
                }
            }

        }

        System.out.println("input : " + input);
        System.out.println("output : " + sb);

            return sb.toString();
    }
    public static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }
}