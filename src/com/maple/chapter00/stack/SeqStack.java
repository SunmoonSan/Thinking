package com.maple.chapter00.stack;

/*
顺序栈
 */
public class SeqStack {
    private int[] data;
    private int top;

    /*
    初始化顺序栈
     */
    SeqStack() {
        data = new int[10];
        top = -1;
    }

    /*
    栈是否为空
     */
    public Boolean isEmpty() {
        return top == -1;
    }

    /*
    获取栈顶元素
     */
    public int getTop() {
        if (top ==-1) {
            throw new Error();
        }
        return data[top];
    }

    /*
    压栈
     */
    public void push(int x) {
        if (top == data.length-1) {
            return;
        }
        data[++top] = x;
    }

    /*
    弹栈
     */
    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        return data[top--];
    }
}
