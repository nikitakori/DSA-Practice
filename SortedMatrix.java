import java.util.*;
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8,},
                {9, 10, 11, 12, 14},
                {15, 16, 17, 18}
        };
        System.out.println(Arrays.toString(search(mat,5)));
    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;

        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binarySearch(mat, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        //run the loop until 2 rows are remaining
        // eliminating the useless rows-> where target cant lies
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (mat[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (mat[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        //now 2 or half rows are remaining
        //check if the target lies in the middle columns of rows
        if (mat[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (mat[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }
        //when target not fount in the middle column than we search in the all four parts
        //search in the 1st part
        if (target <= mat[rStart][cMid - 1]) {
            return binarySearch(mat, rStart, 0, cMid - 1, target);
        }
        //search in the 2nd part
        if (target >= mat[rStart][cMid + 1] && target <=mat[rStart][cols-1]) {
            return binarySearch(mat, rStart, cMid + 1, cols - 1, target);
        }
        //search in the 3rd part
        if (target <= mat[rStart + 1][cMid - 1]) {
            return binarySearch(mat, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(mat, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
