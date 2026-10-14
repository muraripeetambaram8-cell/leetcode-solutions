class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int width=right-left;
            int heights=Math.min(height[left],height[right]);
            int area=width*heights;
            max=Math.max(max,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}