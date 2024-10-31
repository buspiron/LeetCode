public class ValidPalindrome {
    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

     */

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "0P";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
        System.out.println(cleanString(s));
        System.out.println(cleanString(s1));
        System.out.println(isPalindrome2(s));
        System.out.println(isPalindrome2(s1));
    }

    //BasicApproach
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().trim().replaceAll("[^a-z0-9]", "");
        // regex: [^a-z0-9] means everything that is not a lower case number or a digit
        // that regex is very dangerous though, as if we use any other encoding than UTF-8 it will
        // contain far more characters that we consider initially;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //Iterative approach with additional cleaning function
    public static String cleanString(String s) {
        if(s.length() == 0){
            return s;
        }
        String valid = "abcdefghijklmnopqrstuwxyz0123456789";
        s = s.toLowerCase();
        if(valid.contains(String.valueOf(s.charAt(0)))) {
            return s.charAt(0) + cleanString(s.substring(1));
        } else {
            return cleanString(s.substring(1));
        }
    }

    public static boolean isPalindrome2(String s) {
        String temp = cleanString(s);
        StringBuilder sb = new StringBuilder(temp);
        return temp.contentEquals(sb.reverse());
    }

    //inbuilt methods like a boss - no hands, no brain, I'm a Java main!
    public static boolean isPalindrome3(String s) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){
            char c = sb.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String cleanString = sb.toString();
        String reverse = sb.reverse().toString();
        return cleanString.contentEquals(reverse);
    }
}
