/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author admin
 */
public class MyQueue {

    Node head, tail;
    
    public MyQueue(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public MyQueue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public void enqueue(int data) {
        Node p = new Node(data);
        if (isEmpty()) {
            head = tail = p;

        } else {
            tail.next = p;
            tail = p;
        }
    }

    void clear() {
        head = tail = null;
    }

    public int first() {
        if (isEmpty()) {
            return -1;
        }
        int data = head.data;
        return data;
    }

    public void traverse(MyQueue q) {
        MyQueue newQueues = new MyQueue();
        while (!q.isEmpty()) {
            newQueues.enqueue(q.dequeue());

        }
        while (!newQueues.isEmpty()) {
            int t = newQueues.dequeue();
            System.out.print(t + " ");
            q.enqueue(t);
        }
    }

    public void convert(double number) {
        MyQueue q = new MyQueue();

        while (number > 0) {
            double tmp = number * 2;
            if (tmp >= 1) {
                q.enqueue(1);
                number = tmp - 1;
            } else {
                q.enqueue(0);
                number = tmp;
            }
        }
        System.out.print("\nBinary format:\n0.");
        while (!q.isEmpty()) {
            System.out.print(q.dequeue());
        }
    }

}
