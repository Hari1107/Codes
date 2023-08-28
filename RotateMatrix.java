/************************* ROTATE MATRIX (90' clockwise )
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

INPUT :
rows =3
cols=3
1 2 3
4 5 6 
7 8 9

OUTPUT:
7 4 1
8 5 2
9 6 3

                           *********************/
code :
import java.util.*;
public class Main {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
    }
    public static void main (String[] args) {
        Scanner scanner= new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
      int[][] matrix = new int[rows][cols];
 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        Main solution = new Main();
        solution.rotate(matrix);
     for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
     scanner.close();
    }
    }


