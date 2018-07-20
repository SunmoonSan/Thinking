package com.maple.chapter00.stack;

/**
 * 双向栈
 */


public class Stack {
    public static void main(String[] args) {
//        SeqStack stack = new SeqStack();
        LinkStack stack = new LinkStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.isEmpty());
        System.out.println(stack.getTop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.getTop());

        System.out.println("---------------------------");

        BothStack bothStack = new BothStack();
        System.out.println(bothStack.isEmpty(1));
        System.out.println(bothStack.isEmpty(2));

        bothStack.push(1, 1);
        bothStack.push(1, 2);
        bothStack.push(2, 3);
        bothStack.push(2, 4);
        bothStack.push(2, 5);

        System.out.println(bothStack.pop(1));
        System.out.println(bothStack.pop(1));
        System.out.println(bothStack.pop(2));
        System.out.println(bothStack.pop(2));
    }
}
