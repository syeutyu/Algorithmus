package Leetcode;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) { // array를 정렬하고 중간에있는 값을 찾아 넘겨주면 끝
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
    }
}
