package triangulartreasure;

public class Triangular {
    public static int triangular(int n) {
        int result = 1;
        if (n == 1) {
            return  result;
        }

        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result - 1;
    }

}
