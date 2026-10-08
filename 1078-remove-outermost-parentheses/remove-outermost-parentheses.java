class Solution {
    public String removeOuterParentheses(String s) {
        int count1 = 0;
        int count2 = 0;
        String res = "";
        int j =0;

        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count1++;
            }else{
                count2++;
            }

            if(count1==count2){
                res = res + s.substring(j+1,i);
                j = i+1;
            }
        }
        return res;
    }
}