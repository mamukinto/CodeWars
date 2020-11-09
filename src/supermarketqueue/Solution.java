package supermarketqueue;

import java.util.ArrayList;
import java.util.List;

// LINK FOR THE KATA DOWN BELOW :)
//
//  https://www.codewars.com/kata/57b06f90e298a7b53d000a86
//
// There is a queue for the self-checkout tills at the supermarket.
// Your task is write a function to calculate the total time required
// for all the customers to check out!
//
public class Solution {
    public static int solveSuperMarketQueue(int[] customers, int tills) {
        int count = 0;
        //init lists
        List<Till> tillList = new ArrayList<>();

        List<Integer> customersList = new ArrayList<>(customers.length);
        for (int i : customers) {
            customersList.add(i);
        }

        for (int i = 0; i < tills; i++) {
            tillList.add(new Till(true, 0));
        }


        while (!(Till.isAllFree(tillList) && customersList.size() == 0)) {
            customersToTills(customersList, tillList);

            for (Till till : tillList) {
                till.minutePass();
                till.checkIfFree();
            }
            count++;
        }


//        System.out.println(tillList);
//        System.out.println(customersList);


        return count;
    }


    private static void customersToTills(List<Integer> customersList, List<Till> tillList) {
        for (int j = 0; j < customersList.size(); j++) {
            for (Till till : tillList) {
                if (till.isFree()) {
                    if (customersList.size() != 0) {
                        till.setMinutesLeft(customersList.get(j));
                        till.setFree(false);
                        customersList.remove(customersList.get(j));
                    }
                }
            }
        }
    }

    static class Till {
        private boolean isFree;
        private int minutesLeft;

        public Till(boolean isFree, int minutesLeft) {
            this.isFree = isFree;
            this.minutesLeft = minutesLeft;
        }


        public boolean isFree() {
            return isFree;
        }

        public void setFree(boolean free) {
            isFree = free;
        }

        public void setMinutesLeft(int minutesLeft) {
            this.minutesLeft = minutesLeft;
        }

        private static boolean isAllFree(List<Till> tillList) {
            for (Till till : tillList) {
                if (!till.isFree()) {
                    return false;
                }
            }
            return true;
        }

        public void minutePass() {
            minutesLeft -= 1;
        }

        public void checkIfFree() {
            if (minutesLeft == 0) {
                isFree = true;
            }
        }

        @Override
        public String toString() {
            return "{" +
                    "Free = " + isFree +
                    ", minutesLeft = " + minutesLeft +
                    '}';
        }
    }
}
