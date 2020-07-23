/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			int t = sc.nextInt();
			while(t-->0) {
				int n = sc.nextInt();
				int ar[] = new int[n];
				int flag =0;
				for(int i=0; i<n; i++) {
					ar[i] = sc.nextInt();
					
				}
				for(int i=0; i<n; i++) {
					
					if(ar[i]%2 == 0) {
						flag = 1;
						break;
					}
				}
				
				if(flag == 0) {
					
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}
	}
}
