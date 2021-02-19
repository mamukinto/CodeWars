package isanumberprime;

public class Prime {
    public static boolean isPrime(int num) {
        if (num == 0 || num < 0 || num == 1) {
            return false;
        }
        int iterations = num;
        if  (num > 100000) {
            iterations = num/1000; // lolololol))
        }
        for (int i = 2; i < iterations; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
