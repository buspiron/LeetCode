import java.util.Arrays;

public class LongestCommonPrefix {
    /*
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".

    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

     */
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        String[] strs2 = new String[]{"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs2));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String prefix = "";
        String first = strs[0];
        String last = strs[strs.length - 1];
        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) != last.charAt(i)){
                return prefix;
            }
            prefix += first.charAt(i);
        }
        return prefix;
    }
}
