class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int d=nums.length-k;
        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k,nums.length);
    }
    int[] reverse(int[] nums,int start,int end)
    {
        int left=start;
        int right=end-1;
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return nums;
    }
}