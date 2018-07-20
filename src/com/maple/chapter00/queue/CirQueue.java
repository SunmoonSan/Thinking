package com.maple.chapter00.queue;
/*
循环队列
 */

public class CirQueue {
    private static int MAX_SIZE = 10;
    private int[] data;
    private int front;  //队头
    private int rear;  //队尾

    CirQueue() {
        data = new int[MAX_SIZE];
        front = rear = MAX_SIZE - 1;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % MAX_SIZE == front;
    }

    /*
    入队
     */
    public void enterQueue(int x) {
        if (isFull()) {
            return;
        }
        rear = (rear + 1) % MAX_SIZE;
        data[rear] = x;
    }

    /**
     * 出队
     * @return
     */
    public Integer deleteQueue() {
        if (isEmpty()) {
            return null;
        }

        front = (front+1) %MAX_SIZE;
        return data[front];
    }

    /**
     * 获取队头
     * @return
     */
    public Integer getFront() {
        if (isEmpty()) {
            return null;
        }

        return data[(front+1) % MAX_SIZE];
    }

}
