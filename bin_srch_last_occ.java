/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// finding last occurence of an element using Binary Search
import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int key=Integer.parseInt(br.readLine());
		System.out.println("Enter the sorted array");
		String[] arr=br.readLine().split(" ");
		int start=0,end=n-1;
		int ind=binarysearch(arr,start,end,n,key);

		   if(ind == -1)
		       System.out.print("-1");
		  else
		      System.out.print(ind);
	
		}
		
	
	
    static int  binarysearch(String[] arr,int start,int end,int n,int key)
	{
	    while(start<end)
		{
		  int  mid=start+(((end-start)+1)/2);
		   if(Integer.parseInt(arr[mid])<=key)
		   {
		        start=mid;
		   }
		   else
		   {
		       end=mid-1;
		   }
		   if(start==(end-1))
		   {
		       break;
		   }
		}
		if(Integer.parseInt(arr[end])==key)
		{
		    return end;
		}
		else
		{
		    return -1;
		}
	}
}
