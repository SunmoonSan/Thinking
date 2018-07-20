package com.maple.chapter00.stack;

public class BothStack {

    private static int MAX_STACK = 10;
    private int[] data;
    private int top1;
    private int top2;

    BothStack() {
        data = new int[MAX_STACK];
        top1 = -1;
        top2 = MAX_STACK;
    }

    public boolean isEmpty(int stack) {
        boolean isEmpty = false;
        if (stack == 1) {
            isEmpty = (top1 == -1);
        }

        if (stack == 2) {
            isEmpty = top2 == MAX_STACK;
        }
        return isEmpty;
    }

    public void push(int stack, int x) {
        if (top2 - top1 == 1) {
            throw new Error();
        }

        if (stack == 1) {
            data[++top1] = x;
        }

        if (stack == 2) {
            data[--top2] = x;
        }
    }

    public int pop(int stack) {
        if (stack==1) {
            if (top1==-1) {
                throw new Error();
            }
            return data[top1--];
        }

        if (stack == 2) {
            if (top2==MAX_STACK) {
                throw new Error();
            }
            return data[top2++];
        }
        return -1;
    }
}
