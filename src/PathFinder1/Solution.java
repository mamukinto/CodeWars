package PathFinder1;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    static boolean pathFinder(String maze) {
        if (!maze.contains("W")) {
            return true;
        }

        int width = maze.split("\n").length;
        int height = maze.length()/width;

        int down = +width;
        int up = -width;
        int right = +1;
        int left = -1;

        List<Integer> directions = new ArrayList<>();
        directions.add(down);
        directions.add(right);
        directions.add(up);
        directions.add(left);

        int currentPosition = 0;

        while (currentPosition != maze.length() - 1) {
                for (Integer direction : directions) {
                    if (maze.charAt(currentPosition + direction) != 'W') {
                        currentPosition += direction;
                        System.out.println(currentPosition);
                    }
                }
        }


        System.out.println("width: " + width + " | height: " + height);









        return false;
    }
}
