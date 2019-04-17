package com.game98.arithmetic;

import java.util.Stack;

class MyQueue {


    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stackPush.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stackPush.empty() && stackPop.empty();
    }
}