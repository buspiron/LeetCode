public class Sqrtx {
    /*
    Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
    The returned integer should be non-negative as well.
    You must not use any built-in exponent function or operator.

    For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

    Example 1:

    Input: x = 4
    Output: 2
    Explanation: The square root of 4 is 2, so we return 2.

    Example 2:

    Input: x = 8
    Output: 2
    Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

     */
    public static void main(String[] args) {
        int x = 4; //2
        int x2 = 8;
        int x3 = 1;
        int x4 = 3;
        System.out.println(mySqrt2(x));
        System.out.println(mySqrt2(x2));
        System.out.println(mySqrt2(x3));
        System.out.println(mySqrt2(x4));
    }

    //Non-binary search solution - doesn't work, due to the fact they can provide a long despite
    //initial argument being flagged as int. Bastards.
    public static int mySqrt(int x) {
        if(x== 0){
            return 0;
        }
        if(x <= 3){
            return 1;
        }
        for(int i = 1; i <= (x/2 + 1); i++){
            if(i * i == x){
                return i;
            }
            else {
                int j = i - 1;
                if(j * j < x && i * i > x){
                    return j;
                }
            }
        }
        return 0;
    }

    //Binary search
    public static int mySqrt2(int x) {
        if (x == 0) {
            return 0;
        }
        long si = 1; //start index
        long ei = x; //end index
        while(si <= ei){
            long mid = si + (ei - si)/2;
            if(mid * mid <= x && (mid + 1) * (mid + 1) > x){
                return (int)mid;
            } else if(mid * mid < x){
                si = mid + 1;
            } else{
                ei = mid - 1;
            }
        }
        return (int)ei;
    }
}
