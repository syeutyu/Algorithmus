package Hackerrank;

import java.util.*;

public class GradingStudents {
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        for (int i = 0; i < grades.length / 2; i++) { // 배열의 중앙값을 제외하고 한번만 하면되기에 /2
            int temp = grades[i];
            grades[i] = grades[grades.length - 1 - i]; //마지막 인덱스에서 -i만큼 계속 움직여야 하기에
            grades[grades.length - 1 - i] = temp;
        }
        return grades;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(gradingStudents(new int[]{5,4,3,10,2,1})));
    }
}
// 말그대로 배열의 인덱스를 맞은편과 스위치해주는 코드