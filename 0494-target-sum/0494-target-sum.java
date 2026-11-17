class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
    public int helper(int nums[],int target,int i,int sum){
        if(i>=nums.length){
            if(sum==target){
                return 1;
            }else{
                return 0;
            }
        }
        int left=helper(nums,target,i+1,sum+nums[i]);
        int right=helper(nums,target,i+1,sum-nums[i]);
        return left+right;
    }
}