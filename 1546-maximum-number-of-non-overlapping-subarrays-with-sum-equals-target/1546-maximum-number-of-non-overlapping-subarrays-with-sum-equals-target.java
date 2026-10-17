class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-target)){
                count++;
                sum=0;
                map.clear();
                map.put(0,1);
            }else{
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        return count;
    }
}