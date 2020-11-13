package squarensum;

public class Kata {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i : n) {
            sum += Math.pow(i,2);
        }
        return sum;
    }
}
