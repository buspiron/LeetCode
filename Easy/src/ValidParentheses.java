import java.util.Stack;

public class ValidParentheses {
    /*
        cGiven a string s containing just the characters '(', ')', '{', '}', '[' and ']',
        determine if the input string is valid.

    An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.

    Example 1:

        Input: s = "()"
        Output: true

    Example 2:

        Input: s = "()[]{}"
        Output: true

    Example 3:

        Input: s = "(]"
        Output: false

    Example 4:

        Input: s = "([])"
        Output: true

     */

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";
        String s5 = ")(){}";
        String[] tests = new String[]{s1, s2, s3, s4, s5};
        for (String test : tests) {
            System.out.println(isValid(test)); // expected true true false true false
        }
    }

    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        if (s.length() < 2) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                myStack.push(c);
            } else {
                    if (!myStack.isEmpty() && c == ')' && myStack.peek() == '(') {
                        myStack.pop();
                    } else if (!myStack.isEmpty() && c == '}' && myStack.peek() == '{') {
                        myStack.pop();
                    } else if (!myStack.isEmpty() && c == ']' && myStack.peek() == '[') {
                        myStack.pop();
                    } else {
                        myStack.push(c);
                }
            }
        }
        return myStack.isEmpty();
    }
}
