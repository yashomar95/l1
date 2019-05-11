/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++)
		{
		    int n=Integer.parseInt(br.readLine());
		    String[] arr=br.readLine().split(" ");
		    int key=Integer.parseInt(br.readLine());
		    int min_ind=(min_index(arr,n,key));
		    if(key==Integer.parseInt(arr[min_ind]))
		        System.out.println(min_ind);
		    else
		    {
		        if(key>=Integer.parseInt(arr[min_ind+1]) && key<=Integer.parseInt(arr[n-1]))
		        {
		            System.out.println(binary_search(arr,min_ind+1,n-1,key));
		        }
		        else
		        {
		            System.out.println(binary_search(arr,0,min_ind-1,key));
		        }
		    }
		}
		
	}
	
	static int min_index(String[] arr,int n,int key)
	{
	    int start=0,end=n-1;
	    while(start<end)
	    {
	        int mid=start+((end-start)/2);
	        if(Integer.parseInt(arr[mid])<Integer.parseInt(arr[end]))
	        {
	            end=mid;
	        }
	        else
	        {
	            start=mid+1;
	        }
	    }
	    return start;
	}
	
	static int binary_search(String[] arr,int start,int end, int key)
	{
	    while(start<end)
	    {
	        int mid=start+((end-start)/2);
	        if(Integer.parseInt(arr[mid])<key)
	        {
	            start=mid+1;
	        }
	        else
	        {
	            end=mid;
	        }
	    }
	    if(Integer.parseInt(arr[start])==key)
	    {
	        return start;
	    }
	    else
	    {
	        return -1;
	    }
	}
}