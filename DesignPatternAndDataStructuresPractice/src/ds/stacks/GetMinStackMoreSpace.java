package ds.stacks;

import java.util.Stack;

public class GetMinStackMoreSpace {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public GetMinStackMoreSpace() {
        stackData = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if (this.stackMin.empty()) {
            // Check empty individually for getMin will throw exceptions when empty.
            this.stackMin.push(newNum);
        } else if (newNum < this.getMin()) {
            this.stackMin.push(newNum);
        } else {
            // Always push the current min again for newNum >= min
            int value = this.stackMin.peek();
            this.stackMin.push(value);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.empty()) {
            throw new RuntimeException("The stack is empty");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }

    public Integer getMin() {
        if (this.stackMin.empty()) {
            throw new RuntimeException("The stack is empty");
        }
        return this.stackMin.peek();
    }
}
