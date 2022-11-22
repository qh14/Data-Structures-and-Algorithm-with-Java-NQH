/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import Queue.Node;
import Queue.Validation;

/**
 *
 * @author admin
 */
public class MyStack {

    Node top;

    public boolean isEmpty() {
        return (top == null);
    }

    public MyStack() {
        top = null;
    }

    public void push(int x) {
        Node t = new Node(x);

        if (isEmpty()) {
            top = t;
        } else {

            t.next = top;
            top = t;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int x = top.data;
            top = top.next;
            return x;
        }
    }

    public void clear() {
        top = null;
    }

    public void convert() {
        System.out.print("Enter number to convert : ");
        int n = Validation.checkInputInt();
        MyStack t = new MyStack();
        while (n > 0) {

            t.push(n % 2);
            n /= 2;
        }
        System.out.print("Binary Format : ");
        while (!t.isEmpty()) {
            System.out.print(t.pop());
        }
        System.out.println("");
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int x = top.data;
            return x;
        }
    }

    public void traverse(MyStack s) {
        MyStack newstack = new MyStack();
        while (!s.isEmpty()) {
            newstack.push(s.top());
            s.pop();
        }
        while (!newstack.isEmpty()) {
            int t = newstack.top();
            System.out.print(t + " ");
            newstack.pop();
            s.push(t);
        }
    }

}
