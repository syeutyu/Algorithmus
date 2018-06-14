package Reverse;


public class ReverseInteger {
    public static int reverse(int x) {

        int number = x;
        int reverse = 0;

        while(number != 0){ // 숫자를 뒤집는 알고리즘
            reverse = reverse*10 + number%10; //전에 넣은 값들은 10의자리를 하나씩 올려야 하기에
            number = number/10; // 반대로 끝난 숫자는 10의 자리를 하나씩 내려야하기에
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}
