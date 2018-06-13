package InterestingDigits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int[] digits(int base) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < base; i++) {
            int sum = i * i;
            int count = 0;
            while (sum < 10) {
                sum *= i;
            }
            char[] arr = String.valueOf(doconvert(sum, base)).toCharArray();
            for (char c : arr) {
                count += Character.getNumericValue(c);
            }
            System.out.println(i + " - " + count + " : " + Arrays.toString(arr));
            if (count % i == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
        return null;
    }

    private static int doconvert(int num, int deque) {
        StringBuilder text = new StringBuilder();
        while (true) {
            if (0 >= num / deque) {
                text.insert(0, num % deque);
                break;
            }
            text.insert(0, num % deque);
            num = num / deque;
        }
        return Integer.parseInt(text.toString());
    }

    public static void main(String[] args) {
//       System.out.println(Arrays.toString(digits(10)));
//        System.out.println(Arrays.toString(digits(3)));
        digits(9);
//        System.out.println(Arrays.toString(digits(26)));
//        System.out.println(Arrays.toString(digits(30)));
    }
}
