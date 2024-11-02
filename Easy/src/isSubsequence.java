import java.util.Stack;

public class isSubsequence {
    /*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    A subsequence of a string is a new string that is formed from the original string by
    deleting some (can be none) of the characters without disturbing the relative
    positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false

     */
    // Intuitive approach - use stack
    class Solution {
        public boolean isSubsequence(String s, String t) {
            if (s.length() == 0) {
                return true;
            }
            if (t.length() == 0) {
                return false;
            }
            Stack<Character> stack = new Stack<>();
            for (int i = s.length() - 1; i >= 0; i--) {
                stack.push(s.charAt(i));
            }
            for (char c : t.toCharArray()) {
                if (stack.peek() == c) {
                    stack.pop();
                    if (stack.isEmpty()) return true;
                }
            }
            return false;
        }
    }

    //Two-pointer approach
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;
        while(sp < s.length() && tp < t.length()){
            if(s.charAt(sp) == t.charAt(tp)){
                sp++;
            }
            tp++;
        }
        return sp == s.length();
    }
}
