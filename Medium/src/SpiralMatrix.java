import java.util.*;

public class SpiralMatrix {
    /*
    Given an m x n matrix, return all elements of the matrix in spiral order.



Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

     */

    public static void main(String[] args) {
        int[][] m1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] m2 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] m3 = new int[][]{{23,18,20,26,25},{24,22,3,4,4},{15,22,2,24,29},{18,15,23,28,28}}; // [23,18,20,26,25,4,29,28,28,23,15,18,15,24,22,3,4,24,2,22]
        System.out.println(spiralOrder2(m1));
    }


    //Intuition solution for right-hand turn
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        List<String> usedCoords = new ArrayList<>();
        int[][] turn = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int turnOrder = 0;
        int maxNodes = matrix.length * matrix[0].length;
        int startX = 0;
        int startY = 0;
        for(int i = 0; i < maxNodes; i++){
            int directionX = turn[turnOrder][0];
            int directionY = turn[turnOrder][1];
            int value = matrix[startX][startY];
            String used = String.valueOf(startX) + startY;
            String nextUsed = String.valueOf(startX + directionX) + (startY + directionY);
            System.out.println(usedCoords);
            System.out.println("next Used " + nextUsed);
            if(startX + directionX >= matrix.length || startX + directionX < 0 || startY + directionY >= matrix[0].length || startY + directionY < 0 || usedCoords.contains(nextUsed)){
                turnOrder += 1;
                if(turnOrder > 3) turnOrder = 0;
            }
            usedCoords.add(used);
            res.add(value);
            startX += turn[turnOrder][0];
            startY += turn[turnOrder][1];

        }
        return res;
    }

    public static List<Integer> spiralOrder2(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int startX = 0; // >
        int startY = 0; // V
        // so matrix[Y][X] -> [0,1] where 0 == {1,2,3} == 2;
        int directionX = 1; // >
        int directionY = 0; // V
        int maxX = matrix[0].length; // >
        int maxY = matrix.length; // V
        for(int i = 0; i < maxX * maxY; i++){
            res.add(matrix[startY][startX]);
            matrix[startY][startX] = 111;

            if(startX + directionX < 0 || startX + directionX >= maxX || startY + directionY < 0 || startY + directionY >= maxY || matrix[startY + directionY][startX + directionX] == 111){
                // switch pattern {0,1}{1,0}{0,-1}{-1,0}
                int temp = directionX;
                directionX = -directionY;
                directionY = temp;
            }

            startX += directionX;
            startY += directionY;
        }
        return res;
    }
}
