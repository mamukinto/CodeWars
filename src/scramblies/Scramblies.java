package scramblies;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        boolean flag = false;
        StringBuilder s1 = new StringBuilder(str1);

        for (char c : str2.toCharArray()) {
            if (s1.toString().contains(c + "")) {
                flag = true;
                s1.deleteCharAt(s1.indexOf(c + ""));
            } else {
                return false;
            }
        }
        return flag;
    }
}
