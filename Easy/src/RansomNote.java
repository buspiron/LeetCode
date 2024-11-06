import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    /*
    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true



Constraints:

    1 <= ransomNote.length, magazine.length <= 105
    ransomNote and magazine consist of lowercase English letters.


     */
    public static void main(String[] args) {
        String mag = "b";
        String rans = "a";
        System.out.println(canConstruct(rans, mag));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mag = new HashMap<>();
        Map<Character, Integer> rans = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            mag.put(c, mag.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            rans.put(c, rans.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : rans.entrySet()) {
            Integer count = entry.getValue();
            if(!mag.containsKey(entry.getKey()) || mag.get(entry.getKey()) < count) {
                return false;
            }
        }
        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        int[] score = new int[26];
        for (char c : magazine.toCharArray()) {
            score[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            score[c - 'a']--;
            if (score[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
