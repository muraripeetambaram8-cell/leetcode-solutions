class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k){
            return 0;
        }
        int l=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)<k){
                int left=longestSubstring(s.substring(0,i),k);
                int right=longestSubstring(s.substring(i+1),k);
                return Math.max(left,right);
            }
        }
        return s.length();
    }
}