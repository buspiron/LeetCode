import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    /*
    Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

     */

    public static void main(String[] args) {
        int[][] i1 = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] i2 = new int[][]{{1, 3}, {2, 6}, {8, 10}};
        int[][] i3 = new int[][]{{1,4}, {0,1}};
        System.out.println(Arrays.deepToString(merge(i1)));
        System.out.println(Arrays.deepToString(merge(i2)));
        System.out.println(Arrays.deepToString(merge(i3)));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        int[] start = intervals[0];
        for(int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if(next[0] <= start[1]) {
                start[1] = Math.max(start[1], next[1]);
            } else {
                res.add(start);
                start = next;
            }
        }
        res.add(start);
        return res.toArray(new int[res.size()][]);
    }
}
