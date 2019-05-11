class Solution {
    public void rotate(int[] arr1, int r) {
        
        int n=arr1.length;
        if(r>n)
            r=r%n;
        int[] arr2=new int[r];
            int j=0,k=0;
            for(j=n-r;j<n;j++)
            {
                arr2[k]=arr1[j];
                k++;
            }
            j=n-r-1;
            while(j>=0)
            {
                arr1[j+r]=arr1[j];
                j--;
            }
            j=0;
            while(j<r)
            {
                arr1[j]=arr2[j];
                j++;
            }
        
    }
}