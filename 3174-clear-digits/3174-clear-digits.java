class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()&&Character.isDigit(ch)){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}