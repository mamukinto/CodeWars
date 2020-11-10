package doublecola;


public class LineClever {
    public static String whoIsNext(String[] names, int n) {
        double l = names.length;
        while (n >= l) { n -= l; l *= 2; }
        return names[(int) (Math.ceil(names.length * n / l)-1)];
    }
}
