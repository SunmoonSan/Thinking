package com.maple.chapter00.queue;

import java.util.Queue;
import java.util.Stack;

class Node {
    int data;
    Node next;
}

public class LinkQueue {
    private Node front;
    private Node rear;

    LinkQueue() {
        Node s = new Node();
        s.next = null;
        front = rear = s;
    }

    public void enterQueue(int x) {
        Node s = new Node();
        s.data = x;
        s.next = null;
        rear.next = s;
        rear = s;

    }

    public Integer deleteQueue() {
        if (front==rear) {
            return null;
        }
        Node p = front.next;
        int x = p.data;
        front.next = p.next;
        if (p.next == null) {
            rear = front;
        }
        return x;
    }
}

