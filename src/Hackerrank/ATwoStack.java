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


public class ATwoStack {

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
