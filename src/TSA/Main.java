package TSA;

public class Main {
    public static long encrypt(int[] numbers) {
        long max = 1;
        for (int i = 0; i < numbers.length; i++) {
            long temp = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    temp *= numbers[j] + 1;
                } else {
                    temp *= numbers[j];
                }
            }
            max = Math.max(temp, max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(encrypt(new int[]{1, 2, 3}));
        System.out.println(encrypt(new int[]{1, 3, 2, 1, 1, 3}));
        System.out.println(encrypt(new int[]{1, 1, 1, 1}));
        System.out.println(encrypt(new int[]{1000, 999, 998, 997, 996, 995}));

    }

}
