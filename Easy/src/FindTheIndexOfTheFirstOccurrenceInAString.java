public class FindTheIndexOfTheFirstOccurrenceInAString {
    /*
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

     */

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        String haystack2 = "leetcode";
        String needle2 = "leeto";

        System.out.println(strStr(haystack, needle));
        System.out.println(strStr(haystack2, needle2));
        System.out.println("-----------------------------");
        System.out.println(strStr2(haystack, needle));
        System.out.println(strStr2(haystack2, needle2));
    }

    // StringBuilder approach
    public static int strStr(String haystack, String needle) {
        return new StringBuilder(haystack).indexOf(needle);
    }

    // Iterative approach
    public static int strStr2(String haystack, String needle) {
        if(haystack.length() < needle.length()) {
            return -1;
        }
        for(int i = 0; i < haystack.length() - needle.length(); i++) {
            if(haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
