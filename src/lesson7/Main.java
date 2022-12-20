package lesson7;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //([)]
        stack.push("(");
        String s = "([)]";

        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{' || c == '}' || c == ']' || c == ')') {
                stack.push(String.valueOf(c));
            }

            System.out.println(stack.pop());

        }

        for(int i=0;i<stack.size();i++){
            if(stack.pop()==stack.get(i)){
                System.out.println("true");
            }
        }
    }
}
