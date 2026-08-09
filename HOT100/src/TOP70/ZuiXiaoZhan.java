package TOP70;

import java.util.Stack;

public class ZuiXiaoZhan {
    static class MinStack {
        Stack<int[]> stack=new Stack<>();
        public MinStack() {
            stack.push(new int[]{-1,Integer.MAX_VALUE});
        }

        public void push(int value) {
            stack.push(new int[]{value,Math.min(getMin(),value)});
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peek()[0];
        }

        public int getMin() {
            return stack.peek()[1];
        }
    }
    public static void main(String[] args){
        MinStack minStack=new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
