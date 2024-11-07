public class ExcelSheetColumnNumber {
    /*
    Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...



Example 1:

Input: columnTitle = "A"
Output: 1

Example 2:

Input: columnTitle = "AB"
Output: 28

Example 3:

Input: columnTitle = "ZY"
Output: 701

     */

    public static void main(String[] args) {
        String title = "A"; // 1;
        String title2 = "AB"; // 1;
        String title3 = "ZY"; // --> 701
        System.out.println(titleToNumber(title));
        System.out.println(titleToNumber(title2));
        System.out.println(titleToNumber(title3));
    }

    public static int titleToNumber(String columnTitle) {
        int score = 0;
        int exp = 0;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = columnTitle.length() - 1; i >= 0; i--) {
            int multiplier = 1;
            for(int j = 0; j < exp; j++){
                multiplier *= 26;
            }
            int charPos = alphabet.indexOf(columnTitle.charAt(i)) + 1;
            System.out.println(charPos);
            score += charPos * multiplier;
            exp++;
        }
        return score;
    }

    public static int titleToNumber2(String columnTitle) {
        int score = 0;
        for(int i = 0; i < columnTitle.length(); i++) {
            score *= 26;
            score += columnTitle.charAt(i)-'A' + 1;
        }
        return score;
    }

}
