package Fibonacci;

public class Main {
    public static int fibonacci(int number) { // 재귀 진짜 편한데 반복되는 내용 엄청 많음 ex) fibonacchi(43) -> (42), (41) -> (41), (40) 바로 41이 겹치쥬?
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static int fibonacci2(int number) { // 그렇기에 o^n으로 처리하기위한 반복문 생성!!!
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < number; i++) {
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
