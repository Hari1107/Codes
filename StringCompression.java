/******  Consider a string, S, that is a series of characters, each followed by its frequency as an integer.The string is not compressed
correctly, so there may be multiple occurrences of the same character. A properly compressed string will consist of one instance 
of each character in alphabetical order followed by the total count of that character within the string. ****/
code :
import java.util.*;

public class Main {
    public static String properCompression(String s) {
        StringBuilder compressedStr = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) { 
             char c = s.charAt(i); 
             int count = Character.getNumericValue(s.charAt(i + 1)); 
             while (count > 0) {
                compressedStr.append(c);
                count--;
            }
        }

        return compressedStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String compressedResult = properCompression(inputStr);
        System.out.println(compressedResult);   
    }
}

INPUT:
a2b2c2
  
OUTPUT:
aabbcc
