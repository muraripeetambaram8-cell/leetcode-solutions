class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                if(isPalindrome(s,l+1,r)){
                    return true;
                }
                if(isPalindrome(s,l,r-1)){
                    return true;
                }
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isPalindrome(String a,int l,int r){
        while(l<r){
            if(a.charAt(l)!=a.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}