import java.util.*;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    /*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

     */

    //easy solution with sorted array
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    //hashmap solution
    public boolean containsDuplicate2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    //set solution
    public boolean containsDuplicate3(int[] nums) {
        HashSet<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));
        return set.size() == nums.length;
    }

}
