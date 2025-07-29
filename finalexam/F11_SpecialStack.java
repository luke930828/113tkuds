import java.util.Scanner;
import java.util.Stack;

public class F11_SpecialStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpecialStack stack = new SpecialStack();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String cmd = scanner.next();
            if (cmd.equals("push")) {
                int val = scanner.nextInt();
                stack.push(val);
            } else if (cmd.equals("pop")) {
                System.out.println(stack.pop());
            } else if (cmd.equals("getMin")) {
                System.out.println(stack.getMin());
            }
        }
        scanner.close();
    }
}

class SpecialStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public int pop() {
        int val = mainStack.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
        return val;
    }

    public int getMin() {
        return minStack.peek();
    }
}

