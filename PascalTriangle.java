/****************************  PASCAL'S TRIANGLE 
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Input : 3
Output:
[1]
[1,1]
[1,2,1]      ******/
Code :

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();

        if (numRows <= 0)
            return output;

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> curr = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    curr.add(1);
                } else {
                    int value = output.get(i - 1).get(j - 1) + output.get(i - 1).get(j);
                    curr.add(value);
                }
            }
            output.add(curr);
        }

        return output;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numRows = sc.nextInt();
        List<List<Integer>> result = generate(numRows);
        
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
