package Leetcode;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    static int[] hashTable(int[] nums, int target) throws Exception {
        Map<Integer, Integer> map = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];

            if (map.containsKey(temp)) {
                return new int[]{map.get(temp),i};
            }
            map.put(nums[i], i);

        }
        throw new Exception("Not found Target");
        }

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 17)));
        System.out.println(Arrays.toString(hashTable(new int[]{2, 7, 11, 15}, 9)));
    }
}

