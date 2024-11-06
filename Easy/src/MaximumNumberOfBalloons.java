public class MaximumNumberOfBalloons {
    /*
    Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.



Example 1:

Input: text = "nlaebolko"
Output: 1

Example 2:

Input: text = "loonbalxballpoon"
Output: 2

Example 3:

Input: text = "leetcode"
Output: 0



Constraints:

    1 <= text.length <= 104
    text consists of lower case English letters only.

     */

    public int maxNumberOfBalloons(String text) {
        int[] score = new int[26];
        for(char c : text.toCharArray()){
            score[c - 'a']++;
        }
        int max = score[0];
        if(score[1] < max) max = score[1];
        if(score[11] / 2 < max) max = score[11] / 2;
        if(score[13] < max) max = score[13];
        if(score[14] / 2< max) max = score[14] / 2;
        return max;
        //return Math.min(score[1], Math.min(score[0], Math.min(score[13], Math.min(score[11] / 2, score[14] / 2)))); -- tiny bit less optimal
    }
}
