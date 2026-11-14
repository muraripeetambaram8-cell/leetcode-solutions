class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            String p="";
            for(int j=i;j<s.length();j++){
                p=s.substring(i,j+1);
                int low=0;
                int high=p.length()-1;
                boolean P=true;
                while(low<high){
                    if(p.charAt(low)!=p.charAt(high)){
                     P=false;
                    }
                    low++;
                    high--;
                }
                if(P){
                    count++;
                }
            }

        }
        return count;
    }
}