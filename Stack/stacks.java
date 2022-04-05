package Stack;

import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.pop();
        System.out.println(list);
    }
}
