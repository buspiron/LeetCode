public class SearchInsertPosition {
    /*
    Given a sorted array of distinct integers and a target value, return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.

    Example 1:
        Input: nums = [1,3,5,6], target = 5
        Output: 2

    Example 2:
        Input: nums = [1,3,5,6], target = 2
        Output: 1

    Example 3:
        Input: nums = [1,3,5,6], target = 7
        Output: 4

     */

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int[] targets = new int[]{5, 2, 7, 0};
        for(int t : targets){
            System.out.println(searchInsert(nums, t));
        }
    }


    // Most basic, and most common, use for the binary search algorithm.
    public static int searchInsert(int[] nums, int target) {
        int startPosition = 0;
        int endPosition = nums.length - 1;
        while(startPosition <= endPosition){
            int mid = startPosition + (endPosition - startPosition)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                startPosition = mid + 1;
            }
            else if(nums[mid] > target){
                endPosition = mid - 1;
            }
        }
        return startPosition;
    }
}
