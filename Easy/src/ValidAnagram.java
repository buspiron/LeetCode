public class ValidAnagram {
    /*
    Given two strings s and t, return true if t is an
anagram
of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.



Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

     */

    //slow
    public boolean isAnagram(String s, String t) {
        int[] score = new int[26];
        if(s.length() != t.length()) return false;
        for(char c : s.toCharArray()) score[c - 'a']++;
        for(char c : t.toCharArray()) {
            if(--score[c - 'a'] < 0) return false; // alternatively if(score[c-'a']-- == 0
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
      for(int i = 0; i < s.length(); i++) {
          int index = t.indexOf(s.charAt(i));
          if(index == -1) return false;
          else {
              t = t.substring(0, index) + t.substring(index + 1);
          }
      }
      return t.length() == 0;
    }
}
