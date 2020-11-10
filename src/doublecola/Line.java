package doublecola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LINK FOR THE KATA DOWN BELOW :)
//
//  https://www.codewars.com/kata/551dd1f424b7a4cdae0001f0
//
// this solution is too slow for codewars so i did one more in LineClever :)
//
//
//

public class Line {
    public static String whoIsNext(String[] names, int n) {
        List<String> namesList = new ArrayList<>(Arrays.asList(names));
        int countDrunkColas = 0;
        String result = null;
        while(countDrunkColas != n) {
            result = namesList.get(0);
//            System.out.println(namesList);
            String[] doubled = doubleName(namesList.get(0));
            namesList.remove(namesList.get(0));
            namesList.addAll(Arrays.asList(doubled));
            countDrunkColas++;
        }

     return result;
    }

    private static String[] doubleName(String name) {
        return new String[]{name,name};
    }

    public static void main(String[] args) {
        System.out.println(whoIsNext(new String[]{"kote","yulia","ana","mamuka"},1000000));
    }
}
