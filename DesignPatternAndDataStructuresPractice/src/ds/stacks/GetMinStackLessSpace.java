package ds.stacks;

import java.util.Stack;

public class GetMinStackLessSpace {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public GetMinStackLessSpace() {
        stackData = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if (this.stackMin.empty()) {
            // Check empty individually for getMin will throw exceptions when empty.
            this.stackMin.push(newNum);
        } else if (newNum <= this.getMin()) {
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.empty()) {
            throw new RuntimeException("The stack is empty");
        }
        int value = this.stackData.pop();
        if (value == this.getMin()) {
            this.stackMin.pop();
        }
        return value;
    }

    public Integer getMin() {
        if (this.stackMin.empty()) {
            throw new RuntimeException("The stack is empty");
        }
        return this.stackMin.peek();
    }
}
