class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=n-1;i>pivot;i--){
             if(nums[i]>nums[pivot]){
                int temp=nums[i];
                nums[i]=nums[pivot];
                nums[pivot]=temp;
                break;
             }
        }
        int l=pivot+1;
        int r=n-1;
        while(l<r){
            if(nums[l]>=nums[r]){
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
            }
            l++;
            r--;
        }
    }
}