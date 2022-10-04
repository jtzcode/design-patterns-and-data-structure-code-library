package ds.stacks;

public class StackRunner {
    public static void main(String[] args) {
        GetMinStackMoreSpace stackMore = new GetMinStackMoreSpace();
        GetMinStackLessSpace stackLess = new GetMinStackLessSpace();
        int[] data = {3,4,5,1,2,1};
        for (int num : data) {
            System.out.println("Push value to stack 1: " + num);
            stackMore.push(num);
            System.out.println("Current min value in stack 1 is: " + stackMore.getMin());

            System.out.println("Push value to stack 2: " + num);
            stackLess.push(num);
            System.out.println("Current min value in stack 2 is: " + stackLess.getMin());
        }
    }
}
