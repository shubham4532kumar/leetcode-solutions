class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int left = 0;
        int right = 0;
        int no_of_true = 0;
        int no_of_false = 0;
        int min = 0;
        int ans = 0;

        while(right<n){
            char ch = answerKey.charAt(right);
            if(ch=='T'){
                no_of_true++;
            }else{
                no_of_false++;
            }
            

            while(Math.min(no_of_true,no_of_false)>k){
               if(answerKey.charAt(left)=='T'){
                no_of_true--;
               }else{
                  no_of_false--;
               }
               left++;
            }
            ans = Math.max(ans,right-left+1);

            right++;

        }
        return ans;
    }
}