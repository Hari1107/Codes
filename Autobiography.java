/*****************                                 Autobiography Number                       ****************************


Problem Statement :
An Autobiographical Number is a number N such that the first digit of N represents the count of how many zeroes are there in N, the second digit represents the count of how many ones are there in N and so on.
The function accepts string “n” which is a number and checks whether the number is an autobiographical number or not. If it is, an integer is returned, i.e. the count of distinct numbers in ‘n’. If not, it returns 0.
Assumption:
The input string will not be longer than 10 characters.
Input string will consist of numeric characters.
Note:
If string is None return 0.
Example:
Input:
n: “1210”
Output:
3 
********************************************/
code:
import java.util.*;
 import java.util.HashSet;
 public class Main{
     static  int func(String s){
         String k = "";
           HashSet n = new HashSet();
     if(s.length()>10){
             return 0;
         }
         for(int i =0;i<s.length();i++){
             if(n.contains(s.charAt(i))){
                 continue;
             }
             n.add(s.charAt(i));
             k=k+s.charAt(i);
         }
       return k.length();
     }
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.next();
        //  String k = "";
        //  HashSet n = new HashSet();
         System.out.print(func(s));
     }
 }
