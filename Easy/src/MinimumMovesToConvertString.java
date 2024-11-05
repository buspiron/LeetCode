public class MinimumMovesToConvertString {
    /*
    You are given a string s consisting of n characters which are either 'X' or 'O'.

A move is defined as selecting three consecutive characters of s and converting them to 'O'. Note that if a move is applied to the character 'O', it will stay the same.

Return the minimum number of moves required so that all the characters of s are converted to 'O'.



Example 1:

Input: s = "XXX"
Output: 1
Explanation: XXX -> OOO
We select all the 3 characters and convert them in one move.

Example 2:

Input: s = "XXOX"
Output: 2
Explanation: XXOX -> OOOX -> OOOO
We select the first 3 characters in the first move, and convert them to 'O'.
Then we select the last 3 characters and convert them so that the final string contains all 'O's.

Example 3:

Input: s = "OOOO"
Output: 0
Explanation: There are no 'X's in s to convert.

     */

    // Recursive
    public int minimumMoves(String s) {
        if(s.length() == 0){
            return 0;
        }
        if(s.charAt(0) == 'O'){
            return minimumMoves(s.substring(1));
        }
        int maxLen = Math.min(3, s.length());
        return 1 + minimumMoves(s.substring(maxLen));
    }

    // Iterative
    public int minimumMoves2(String s) {
            int count = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'X'){
                    count++;
                    i += 2;
                }
            }
            return count;
    }
}
