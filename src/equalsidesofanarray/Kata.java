package equalsidesofanarray;

import java.util.Arrays;

public class Kata {
    public static int findEvenIndex(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int[] leftSide = Arrays.copyOfRange(arr,0,i);
            int[] rightSide = Arrays.copyOfRange(arr,i + 1,arr.length);
            int leftSum = 0;
            int rightSum = 0;

            for (int i1 = 0; i1 < leftSide.length; i1++) {
                leftSum += leftSide[i1];
            }
            for (int i1 = 0; i1 < rightSide.length; i1++) {
                rightSum += rightSide[i1];
            }
            
            boolean sidesAreEqual = leftSum == rightSum;
            if (sidesAreEqual) {
                index = i;
            }
            
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Arrays.copyOfRange(new int[]{1, 2, 3, 4, 3, 2, 1}, 0, 3)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(new int[]{1, 2, 3, 4, 3, 2, 1}, 4, 7)));
        System.out.println(new int[]{1, 2, 3, 4, 3, 2, 1}.length);
    }
}
