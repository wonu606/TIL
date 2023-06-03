package com.wonu606;

import java.util.EmptyStackException;

class MyStack<E> {
    private class Node<E> {

        public E data;
        public Node next;

        public Node(E data) {
            this.data = data;
        }
    }

    private Node<E> top;

    public void push(E item) {
        Node<E> newTop = new Node<>(item);
        newTop.next = top;
        top = newTop;
    }

    public E pop() {
        checkEmpty();
        E result = top.data;
        top = top.next;
        return result;
    }

    public E peek() {
        checkEmpty();
        return top.data;
    }

    private void checkEmpty() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
}
public class StackExample {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
