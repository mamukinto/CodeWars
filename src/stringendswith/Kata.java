package stringendswith;

public class Kata {
    public static boolean solution(String str, String ending) {
        if (str.length()<ending.length()) {
            return false;
        }
        return ending.equals(str.substring(str.length() - ending.length()));
    }
}
