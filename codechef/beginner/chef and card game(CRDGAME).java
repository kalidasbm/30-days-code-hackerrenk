/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			int t = sc.nextInt();
			while(t-->0) {
				int n = sc.nextInt();
				int point =0;
				int point1 =0;
				for(int i=0; i<n; i++) {
					int c = sc.nextInt();
					int m = sc.nextInt();
					int sum = 0; 
					int sum1= 0;
					while(c/10 > 0) {
						sum = sum +(c%10);
						c = c/10;
					}
					sum = sum+c;
					
					while(m/10 > 0) {
						sum1 = sum1 +(m%10);
						m = m/10;
					}
					sum1 = sum1+m;
					
					if(sum>sum1) {
						point++;
					}else if(sum<sum1){
						point1++;
					}else {
						point++;
						point1++;
					}
					
				}
				if(point > point1) {
					System.out.println("0 "+point);
				}else if(point < point1) {
					System.out.println("1 "+point1);
				}else{
					System.out.println("2 "+point);
				}
			}
		}
		
		// your code goes here
	}
}
