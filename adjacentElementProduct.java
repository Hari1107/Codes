/************************** Adjacent Element Product

Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
Example
For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.
7 and 3 produce the largest product.
                                                   **********************/
code :
int solution(int[] inputArray) {
       int maxProduct = Integer.MIN_VALUE;
        
        for (int i = 0; i < inputArray.length - 1; i++) {
            int product = inputArray[i] * inputArray[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }
        
        return maxProduct;
    }
