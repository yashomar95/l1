/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(br.readLine());
        for(int i=1;i<=t;i++)
        {
            String[] str=br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int r=Integer.parseInt(str[1]);
            String[] arr1=br.readLine().split(" ");
            String[] arr2=new String[r];
            int j=0;
            for(j=0;j<r;j++)
                arr2[j]=arr1[j];
            int k=0;
            while(j<n)
            {
                arr1[k]=arr1[j];
                k++;
                j++;
            }
            j=0;
            while(k<n)
            {
                arr1[k]=arr2[j];
                k++;
                j++;
            }
            for(j=0;j<n;j++)
                System.out.print(arr1[j]+" ");
        
            System.out.println("");
        }
        
	}
}