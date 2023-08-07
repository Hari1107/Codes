/*********  Given a square matrix mat, return the sum of the matrix diagonals.Only include the sum of all the elements on the 
           primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
           Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
"" Notice that element mat[1][1] = 5 is counted only once. ""
           ******/
code :
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n = mat.length;
        int i=0; 
        int j=0;
        while(i<n){
        sum += mat[i][j];
        i++;
        j++;
    }
    i=0;
    j=n-1;
    while(j>=0){
        if(i!=j)
        sum += mat[i][j];
        i++;
        j--;
    }
 return sum;
}

}
