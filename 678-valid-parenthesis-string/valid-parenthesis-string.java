class Solution {
    int n;
    Boolean[][] dp;
    boolean solve(String s,int i,int balance){
        if(balance<0){
            return false;
           }
           if(i==n){
              return balance==0;
           }

           if(dp[i][balance]!=null){
            return dp[i][balance];
           }

           boolean ans;

        if(s.charAt(i)=='('){
            ans =  solve(s,i+1,balance+1);
        }else if(s.charAt(i)==')'){
            ans =  solve(s,i+1,balance-1);
        }else{
           ans = solve(s,i+1,balance+1) ||
            solve(s,i+1,balance-1) || solve(s,i+1,balance);
        }

        return dp[i][balance] = ans;
        
    }
    public boolean checkValidString(String s) {
        n = s.length();
        dp = new Boolean[n][n+1];
         return solve(s,0,0);
    }
}