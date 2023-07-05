/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 int l,r,v;
	 Scanner sc = new Scanner(System.in);
    	l=sc.nextInt();
	   r = sc.nextInt();
	   v = sc.nextInt();
	 int range = 0;
	 for(int i=l;i<=r;i++){
	     if(i%v==0){
	         range++;
	     }
	 
	 }
	 System.out.print(range);
	}
}
