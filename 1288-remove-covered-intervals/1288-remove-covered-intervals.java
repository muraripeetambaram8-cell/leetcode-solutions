class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int end=-1;
        int count=0;
        for(int i=0;i<intervals.length;i++){
            int a=intervals[i][0];
            int b=intervals[i][1];
            if(b>end){
                count++;
                end=b;
            }
        }
        return count;
    }
}