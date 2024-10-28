import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, a
    nd you may not use the same element twice.

    You can return the answer in any order.



    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]
     */
    public static void main(String[] args) {
         int[] nums = new int[]{2, 7, 11, 15};
         int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    //nested loop solution, O-n squared
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    //HashMap, logn
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int rest = target - nums[i];
            if(sumMap.containsKey(rest)) {
                return new int[]{sumMap.get(rest), i};
            }
            sumMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
