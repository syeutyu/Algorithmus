package Hackerrank;

import java.util.Scanner;
import java.util.Stack;

class MyQueue <T>{
    Stack<T> lifo = new Stack<>();
    Stack<T> fifo = new Stack<>();
    public void enqueue(T value) { // Push onto newest stack
        fifo.push(value);
    }

    public T peek() {
        prepOld();
        return lifo.peek();
    }

    public void dequeue() {
        prepOld();
        lifo.pop();
    }

    public void prepOld(){
        if (lifo.isEmpty())
            while(!fifo.isEmpty())
                lifo.push(fifo.pop());
    }
}


public class ATwoStack { // 두개의 스택으로 큐를 만드는거 기본적인 구조는 enqueue할때는 stack1에만 dequeue, peek할때는 stack2이 비어있을때만 넣고 아니면 그냥 출력

    public static void main(String[] args){
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
