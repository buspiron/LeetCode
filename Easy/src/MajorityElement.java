import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /*
    Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

     */

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int majorNumber = 0;
        int majorityCount = 0;
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            int check = map.get(num);
            if(check > majorityCount) {
                majorNumber = num;
                majorityCount = check;
            }
        }
        return majorNumber;
    }
}
