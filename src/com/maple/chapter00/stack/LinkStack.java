package com.maple.chapter00.stack;

/**
 * 链式实现堆栈
 */

class Node {
    int data;
    Node next;
}

public class LinkStack {
    private Node top;

    /*
    初始化空栈
     */
    LinkStack() {
        top = null;
    }

    /*
    压栈
     */
    public void push(int x) {
        Node s = new Node();
        s.data = x;
        s.next = top;
        top = s;
    }

    /*
    弹栈
     */
    public Integer pop() {
        if (top == null) {
            return null;
        }

        int x = top.data;
        top = top.next;
        return x;
    }

    /*
    获取栈顶元素
     */
    public Integer getTop() {
        if (top != null) {
            return top.data;
        }
        return null;
    }

    /*
    栈是否为空
     */
    public Boolean isEmpty() {
        return top == null;
    }
}
