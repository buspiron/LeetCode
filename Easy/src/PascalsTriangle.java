import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalsTriangle {
    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.

    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

    Example 1:
        Input: numRows = 5
        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

    Example 2:
        Input: numRows = 1
        Output: [[1]]
     */

    public static void main(String[] args) {
        List<List<Integer>> list = generate(6);
        for(List list1 : list) {
            System.out.println(list1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int[] values = new int[]{1,2,3,4,5,7,8,1,2};
        for(int value : values){
            if(map.containsKey(value)){
                System.out.println("ALREADY IN!");
            } else {
                map.put(value, map.getOrDefault(value, 0) + 1);
            }
        }

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }
}
