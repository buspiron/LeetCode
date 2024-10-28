public class PalindromeNumber {
    /*
    Example 1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

    Example 2:

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left,
        it becomes 121-. Therefore it is not a palindrome.

    Example 3:

    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

     */
    public static void main(String[] args) {
        int x = 1234321;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome2(x));
    }

    // String conversion method
    public static boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        for(int i = 0; i < xString.length()/2; i++){
            if(xString.charAt(i) != xString.charAt(xString.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    //Without converting to String
    public static boolean isPalindrome2(int x) {
        if(x < 0){
            return false;
        }

        long reversed = 0;
        long temp = x;

        while(temp != 0){
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return x == reversed;
    }
}
