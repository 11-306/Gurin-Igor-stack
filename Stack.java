package stack;

import java.util.Deque;
import java.util.LinkedList;

public class Stack {
    private final Deque<Integer> min;
    private final Deque<Integer> max;
    private final Deque<Integer> data;
    public Stack(){
        min = new LinkedList<>();
        max = new LinkedList<>();
        data = new LinkedList<>();
    }
    void pop(){
        if (!data.isEmpty()){
            int temp = data.pop();
            if (temp == min.peek()){
                min.pop();
            }
            if (temp == max.peek()){
                max.pop();
            }
        } else{
            throw new IllegalArgumentException("Stack is Empty!");
        }
    }
    void push(int x){
        data.push(x);
        if (min.isEmpty() || min.peek() > x){
            min.push(x);
        }
        if (max.isEmpty() || max.peek() < x){
            max.push(x);
        }
    }
    int min(){
        return min.peek();
    }
    int max(){
        return max.peek();
    }
    void print(){
        for(int s: data){
            System.out.print(s + " ");
        }
    }
}
