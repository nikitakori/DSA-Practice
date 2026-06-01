import java.util.*;
public class PascalTriangle {

    //https://leetcode.com/problems/pascals-triangle/

    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> triangle = generate(n);
        for(List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
    public static List<Integer> generateRow(int row) {

        List<Integer> ansRow = new ArrayList<>();

        long ans = 1;
        ansRow.add(1);

        for(int col = 1; col < row; col++) {

            ans = ans * (row - col);
            ans = ans / col;

            ansRow.add((int) ans);
        }
        return ansRow;

    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int row = 1; row <= numRows; row++) {
            ans.add(generateRow(row));
        }
        System.out.println();
        return ans;
    }
}
