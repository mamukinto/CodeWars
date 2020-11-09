package tenminutewalk;

public class TenMinuteWalk {
    public static boolean isValid(char[] walk) {
        int n = 0;
        int s = 0;
        int w = 0;
        int e = 0;
        for (int i = 0; i < walk.length; i++) {
           switch (walk[i]) {
               case 'n':
                   n++;
                   break;
               case 's':
                   s++;
                   break;
               case 'w':
                   w++;
                   break;
               case 'e':
                   e++;
                   break;
           }
        }


        return walk.length == 10 && w == e && s == n;
    }
}
