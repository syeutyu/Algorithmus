package Fibonacci;

public class Main {
    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static int fibonacci2(int number) {
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < number; i++) { // 10번 반복
            a = b;
            b = c;
            c = a + b;
        }
        return c;

    }

    public static void main(String args[]) {
        System.out.println(fibonacci2(3));
        System.out.println(fibonacci(3));

    }

}
