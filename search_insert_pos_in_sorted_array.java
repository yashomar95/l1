class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<end)
        {
            int mid=start+((end-start)/2);
            if(target<=nums[mid])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        if(target>nums[start])
            return end+1;
        return start;
    }
}