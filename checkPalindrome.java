/************ Check Palindrome
Given the string, check if it is a palindrome.
Example
For inputString = "aabaa", the output should be
solution(inputString) = true;
For inputString = "abac", the output should be
solution(inputString) = false;                           **********/
code:
boolean solution(String inputString) {
     int length = inputString.length();
        for (int i = 0; i < length / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
