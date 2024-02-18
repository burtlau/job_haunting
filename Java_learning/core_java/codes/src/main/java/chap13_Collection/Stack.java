package chap13_Collection;
import java.util.*;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(-10);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
