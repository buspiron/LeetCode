import java.util.Arrays;

public class LengthOfTheLastWord {
    /*
    Given a string s consisting of words and spaces, return the length of the last word in the string.
    A word is a maximal substring consisting of non-space characters only.

    Example 1:

    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5.

    Example 2:

    Input: s = "   fly me   to   the moon  "
    Output: 4
    Explanation: The last word is "moon" with length 4.

    Example 3:

    Input: s = "luffy is still joyboy"
    Output: 6
    Explanation: The last word is "joyboy" with length 6.

     */
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        String[] sentences = new String[]{s1, s2, s3};
        for(String sentence : sentences) {
            System.out.println(lengthOfLastWord(sentence));
            System.out.println(lengthOfLastWord2(sentence));
            System.out.println(lengthOfLastWord3(sentence));
        }
    }

    // Stream solution
    public static int lengthOfLastWord(String s) {
        return Arrays.stream(s.trim().split(" "))
                .map(String::length)
                .reduce((a,b) -> b)
                .orElse(0);
    }

    // Standard solution
    public static int lengthOfLastWord2(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }

    // Early Java solution
    public static int lengthOfLastWord3(String s) {
        int length = 0;
        while (s.charAt(0) == ' '){
            s = s.substring(1);
        }
        while (s.charAt(s.length()-1) == ' '){
            s = s.substring(0, s.length()-1);
        }
        String reversed = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        for(int i = 0; i < reversed.length(); i++) {
            if(reversed.charAt(i) == ' ') {
                break;
            }
            length++;
        }
        return length;
    }
}
