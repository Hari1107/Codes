/****************         SPIRAL MATRIX 
Given an m x n matrix, return all elements of the matrix in spiral order.

INPUT :
rows = 3
cols = 3
matrix [1,2,3
        4,5,6
        7,8,9 ]

OUTPUT : [1,2,3,6,9,8,7,4,5]                      *************/

CODE :
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Main {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int left = 0;
        int right = matrix.length - 1;
        int top = 0;
        int bottom = matrix[0].length - 1;

        while (left <= right && top <= bottom) {
           
            for (int j = top; j <= bottom; j++) {
                ans.add(matrix[left][j]);
            }
            left++;
 
            for (int i = left, j = bottom; i <= right; i++) {
                ans.add(matrix[i][j]);
            }
            bottom--;

           if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    ans.add(matrix[right][j]);
                }
                right--;
            }
 
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[i][top]);
                }
                top++;
            }
        }

        return ans;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(); 
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols]; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Main solution = new Main();
        List<Integer> result = solution.spiralOrder(matrix);
        System.out.println(result);
    }
}


  
