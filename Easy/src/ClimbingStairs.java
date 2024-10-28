import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    /*
    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    Example 1:

    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps

    Example 2:

    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step

     */
    public static void main(String[] args) {

    }
    // Iterative
    public static int climbStairs2(int n) {
        if(n <= 2) return n;
        int first = 1, second = 2;
        for(int i = 3; i <= n; i++){
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }

    // Map, recursion
    public static int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        if (n <= 0) return 0;
        if (n <= 3) return n;
        if(memo.containsKey(n)) return memo.get(n);
        int ways = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, ways);

        return ways;
    }
}
