package KiwiJuice;

import java.util.*;

public class Main {

    public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        for (int i = 0; i < fromId.length; i++) {
            int sum = bottles[fromId[i]] + bottles[toId[i]];
            if(capacities[toId[i]] < sum){
                bottles[fromId[i]] = sum - capacities[toId[i]];
                bottles[toId[i]] = capacities[toId[i]];
            } else{
                bottles[fromId[i]] = 0;
                bottles[toId[i]] = sum;
            }
        }
        return bottles;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(thePouring(new int[]{20, 20}, new int[]{5, 8}, new int[]{0}, new int[]{1})));
        System.out.println(Arrays.toString(thePouring(new int[]{10, 10}, new int[]{5, 8}, new int[]{0}, new int[]{1})));
        System.out.println(Arrays.toString(thePouring(new int[]{30,20, 10}, new int[]{10,5,5}, new int[]{0,1,2}, new int[]{1,2,0})));
        System.out.println(Arrays.toString(thePouring(new int[]{14, 35,86,58,25,62}, new int[]{6,34,27,38,9,60}, new int[]{1,2,4,5,3,3,1,0}, new int[]{0,1,2,4,2,5,3,1})));
    }

}
