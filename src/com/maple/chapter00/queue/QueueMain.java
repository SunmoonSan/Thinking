package com.maple.chapter00.queue;

public class QueueMain {
    public static void main(String[] args) {
        /*CirQueue queue = new CirQueue();
        queue.enterQueue(1);
        queue.enterQueue(2);
        queue.enterQueue(3);
        queue.enterQueue(4);
        queue.enterQueue(5);

        System.out.println(queue.getFront());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());

        queue.enterQueue(9);
        queue.enterQueue(8);
        queue.enterQueue(7);
        queue.enterQueue(6);
        queue.enterQueue(5);
        queue.enterQueue(4);
        queue.enterQueue(3);
        queue.enterQueue(2);
        queue.enterQueue(1);
        queue.enterQueue(0);
        queue.enterQueue(10);

        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());*/

        LinkQueue linkQueue = new LinkQueue();
        linkQueue.enterQueue(1);
        linkQueue.enterQueue(2);
        linkQueue.enterQueue(3);
        linkQueue.enterQueue(4);
        linkQueue.enterQueue(5);

        System.out.print(linkQueue.deleteQueue() + ",");
        System.out.print(linkQueue.deleteQueue() + ",");
        System.out.print(linkQueue.deleteQueue() + ",");
        System.out.print(linkQueue.deleteQueue());
    }
}
