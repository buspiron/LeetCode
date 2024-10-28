public class AddBinary {
    /*
    Given two binary strings a and b, return their sum as a binary string.

    Example 1:
        Input: a = "11", b = "1"
        Output: "100"

    Example 2:
        Input: a = "1010", b = "1011"
        Output: "10101"
     */
    public static void main(String[] args) {
        String a1 = "11";
        String b1 = "1";
        String a2 = "1010";
        String b2 = "1011";
        System.out.println(addBinary(a1, b1));
        System.out.println(addBinary(a2, b2));
    }

    public static String addBinary(String a, String b) {
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (lenA >= 0 || lenB >= 0 || carry == 1) {
            if(lenA >= 0) carry += a.charAt(lenA--) - '0';
            if(lenB >= 0) carry += b.charAt(lenB--) - '0';
            result.append(carry % 2);
            carry /= 2;
        }
        return result.reverse().toString();
    }
}
