package src.dsa.commonUtils;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;

    public MyQueue() {
        this.in = new Stack<>();
        this.out = new Stack<>();
    }

    public int push(Integer val) {
        return in.push(val);
    }

    public void pop() {
        movingInputStackValToOutStack();
        out.pop();
    }

    public int peek() {
        movingInputStackValToOutStack();
        return out.peek();
    }

    public boolean isEmpty() {
        return  in.isEmpty() && out.isEmpty();
    }

    private void movingInputStackValToOutStack() {
        if(out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
}
